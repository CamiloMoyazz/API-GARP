package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Receta;

import java.util.List;
import java.util.Optional;

public interface RecetaService {
    String save(Receta receta);
    String delete(int id);
    String update(Receta receta);
    List<Receta> getRecetas();
    Optional<Receta> find(int id);
}
