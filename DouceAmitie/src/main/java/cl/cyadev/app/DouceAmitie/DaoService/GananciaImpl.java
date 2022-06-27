package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GananciaDiaria;
import cl.cyadev.app.DouceAmitie.Entity.GastoDiario;
import cl.cyadev.app.DouceAmitie.Repository.GananciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("gananciaService")
public class GananciaImpl implements GananciaService{

    @Autowired
    @Qualifier("gananciaRepository")
    private GananciaRepository repository;

    @Override
    public List<GananciaDiaria> getAllGanancias() {
        return repository.findAll();
    }

    @Override
    public List<GananciaDiaria> getByMes(String fecha) {
        int year;
        int actualYear;
        List<GananciaDiaria> ganancias = repository.findAll();
        List<GananciaDiaria> gananciasMes = new ArrayList<>();

        for(GananciaDiaria g : ganancias) {
            try {
                //Conversion de Fecha
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(fecha);
                Date dateActual = formatter.parse(g.getFechaGanancia());
                LocalDate localDate1 = dateActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                year = localDate.getYear();
                actualYear = localDate1.getYear();

                if(year == actualYear){
                    gananciasMes.add(g);
                }
            } catch (Exception ex) {
                return null;
            }
        }
        return gananciasMes;
    }
    @Override
    public String save(GananciaDiaria ganancia) {
        repository.save(ganancia);
        return "EXITO!!";
    }

    @Override
    public String update(GananciaDiaria ganancia) {
        if(find(ganancia.getId()).isPresent()){
            repository.save(ganancia);
            return "EXITO!";
        }else {
            return "ERROR!!";
        }
    }
    @Override
    public String delete(int id) {
        if(find(id).isPresent()){
            repository.deleteById(id);
            return "ELIMINADO!";
        }else {
            return "ERROR!";
        }

    }
    @Override
    public Optional<GananciaDiaria> find(int id) {
        return repository.findById(id);
    }
}
