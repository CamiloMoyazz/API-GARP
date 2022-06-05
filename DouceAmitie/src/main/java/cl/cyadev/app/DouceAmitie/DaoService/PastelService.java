package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;

import java.util.List;
import java.util.Optional;

public interface PastelService {
    String save(Pastel pastel);
    String delete(int id);
    String update(Pastel pastel);
    List<Pastel> getAll();
    Optional<Pastel> find(int id);
}
