package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Receta;

import java.util.List;
import java.util.Optional;

public interface RecetaService {
    Receta save(Receta receta);
    Receta delete(int id);
    Receta update(Receta receta);
    List<Receta> recetaList();
    Optional<Receta> find();
}
