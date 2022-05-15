package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;

import java.util.List;
import java.util.Optional;

public interface PastelService {
    Pastel save(Pastel pastel);
    Pastel delete(int id);
    Pastel update(Pastel pastel);
    List<Pastel> pastelList();
    Optional<Pastel> find();
}
