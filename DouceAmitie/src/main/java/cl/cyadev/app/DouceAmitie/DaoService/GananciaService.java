package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GananciaDiaria;

import java.util.List;
import java.util.Optional;

public interface GananciaService {
    GananciaDiaria save(GananciaDiaria ganancia);
    GananciaDiaria delete(int id);
    GananciaDiaria update(GananciaDiaria ganancia);
    List<GananciaDiaria> gananciaDiariaList();
    Optional<GananciaDiaria> find(int id);
}
