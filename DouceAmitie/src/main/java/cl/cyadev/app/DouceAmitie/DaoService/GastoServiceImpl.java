package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GastoDiario;
import cl.cyadev.app.DouceAmitie.Repository.GastoRepository;
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

@Service("gastoService")
public class GastoServiceImpl implements GastoService{

    @Autowired
    @Qualifier("gastoRepository")
    private GastoRepository repository;

    @Override
    public List<GastoDiario> getGastos() {
        return repository.findAll();
    }
    @Override
    public List<GastoDiario> getGastosByMes(String fecha) {
        int mesRequerido;
        int mesActual;
        int year;
        int actualYear;
        List<GastoDiario> gastos = repository.findAll();
        List<GastoDiario> gastosMes = new ArrayList<>();

        for(GastoDiario g : gastos) {
            try {
                //Conversion de Fecha
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(fecha);
                Date dateActual = formatter.parse(g.getFechaGasto());
                LocalDate localDate1 = dateActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                mesRequerido = localDate.getMonthValue();
                mesActual = localDate1.getMonthValue();
                year = localDate.getYear();
                actualYear = localDate1.getYear();

            if(mesRequerido == mesActual && year == actualYear){
                gastosMes.add(g);
            }
            } catch (Exception ex) {
                return null;
            }
        }
        return gastosMes;
    }

    @Override
    public String save(GastoDiario gasto) {
        repository.save(gasto);
        return "EXITO!";
    }

    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "EXITO! ELIMINADO";
    }

    @Override
    public String update(GastoDiario gasto) {
        if(find(gasto.getId()).isPresent()){
            repository.save(gasto);
            return "EXITO! ACTUALIZADO!";
        }else {
            return "ERROR!";
        }
    }
    @Override
    public Optional<GastoDiario> find(int id) {
        return repository.findById(id);
    }
}
