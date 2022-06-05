package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Trabajador;

import java.util.List;
import java.util.Optional;

public interface TrabajadorService {
    String save(Trabajador trabajador);
    String delete(Trabajador trabajador);
    String update(Trabajador trabajador);
    List<Trabajador> getAll();
    Trabajador getById(String rut);
    Boolean existeTrabajador(String rut);
    Optional<Trabajador> find(String rut);
}
