package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import cl.cyadev.app.DouceAmitie.Repository.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
    public Optional<Pastel> find(int id) {
        return repository.findById(id);
    }
}
