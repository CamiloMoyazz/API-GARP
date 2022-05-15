package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GananciaDiaria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("gananciaService")
public class GananciaImpl implements GananciaService{
    @Override
    public GananciaDiaria save(GananciaDiaria ganancia) {
        return null;
    }

    @Override
    public GananciaDiaria delete(int id) {
        return null;
    }

    @Override
    public GananciaDiaria update(GananciaDiaria ganancia) {
        return null;
    }

    @Override
    public List<GananciaDiaria> gananciaDiariaList() {
        return null;
    }

    @Override
    public Optional<GananciaDiaria> find(int id) {
        return Optional.empty();
    }
}
