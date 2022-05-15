package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Receta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("recetaService")
public class RecetaServiceImpl implements RecetaService{
    @Override
    public Receta save(Receta receta) {
        return null;
    }

    @Override
    public Receta delete(int id) {
        return null;
    }

    @Override
    public Receta update(Receta receta) {
        return null;
    }

    @Override
    public List<Receta> recetaList() {
        return null;
    }

    @Override
    public Optional<Receta> find() {
        return Optional.empty();
    }
}
