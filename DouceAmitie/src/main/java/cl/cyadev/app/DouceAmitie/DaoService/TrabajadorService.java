package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Trabajador;

import java.util.List;
import java.util.Optional;

public interface TrabajadorService {
    Trabajador save(Trabajador trabajador);
    Trabajador delete(String rut);
    Trabajador update(Trabajador trabajador);
    List<Trabajador> getAll();
    Optional<Trabajador> find();
}
