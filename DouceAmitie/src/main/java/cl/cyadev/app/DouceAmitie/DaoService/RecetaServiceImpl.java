package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Receta;
import cl.cyadev.app.DouceAmitie.Repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("recetaService")
public class RecetaServiceImpl implements RecetaService{

    @Autowired
    @Qualifier("recetaRepository")
    private RecetaRepository repository;

    @Override
    public String save(Receta receta) {
        repository.save(receta);
        return "Ingresado con EXITO!";
    }

    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "Eliminado!";
    }

    @Override
    public String update(Receta receta) {
        if(find(receta.getIdReceta()).isPresent()){
            repository.save(receta);
            return "Actualizado!";
        }else {
            return "ERROR!";
        }
    }

    @Override
    public List<Receta> getRecetas() {
        return repository.findAll();
    }

    @Override
    public Optional<Receta> find(int id) {
        return repository.findById(id);
    }
}
