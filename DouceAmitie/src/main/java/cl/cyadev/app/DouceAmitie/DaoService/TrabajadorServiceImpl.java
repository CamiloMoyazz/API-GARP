package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("trabajadorService")
public class TrabajadorServiceImpl implements TrabajadorService{
    @Override
    public Trabajador save(Trabajador trabajador) {
        return null;
    }

    @Override
    public Trabajador delete(String rut) {
        return null;
    }

    @Override
    public Trabajador update(Trabajador trabajador) {
        return null;
    }

    @Override
    public List<Trabajador> getAll() {
        return null;
    }

    @Override
    public Optional<Trabajador> find() {
        return Optional.empty();
    }
}
