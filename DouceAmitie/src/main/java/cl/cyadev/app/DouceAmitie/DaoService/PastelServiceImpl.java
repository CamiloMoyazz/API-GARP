package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import cl.cyadev.app.DouceAmitie.Repository.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service("pastelService")
public class PastelServiceImpl implements PastelService{

    @Autowired
    @Qualifier("pastelRepository")
    private PastelRepository repository;

    @Override
    public String save(Pastel pastel) {
        repository.save(pastel);
        return "Ingresado!";
    }

    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "ELIMINADO!";
    }

    @Override
    public String update(Pastel pastel) {
        if(find(pastel.getIdPastel()).isPresent()){
            repository.save(pastel);
            return "Actualizado";
        }else {
            return "ERROR";
        }
    }

    @Override
    public List<Pastel> getAll() {
        return repository.findAll();
    }

    @Override
    public Pastel getPastelById(int id) {
        Pastel p = new Pastel();
        List<Pastel> pasteles = repository.findAll();
        for(Pastel pa : pasteles){
            if(pa.getIdPastel() == id){
                p.setIdPastel(pa.getIdPastel());
                p.setNombre(pa.getNombre());
                p.setDescripcion(pa.getDescripcion());
                p.setPrecio(pa.getPrecio());
            }
        }
        if(p.getIdPastel() != 0){
            return p;
        }else {
            return null;
        }

    }

    @Override
    public Optional<Pastel> find(int id) {
        return repository.findById(id);
    }
}
