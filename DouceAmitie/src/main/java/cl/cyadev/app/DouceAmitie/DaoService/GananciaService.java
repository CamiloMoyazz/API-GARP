package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GananciaDiaria;

import java.util.List;
import java.util.Optional;

public interface GananciaService {
    String save(GananciaDiaria ganancia);
    String delete(int id);
    String update(GananciaDiaria ganancia);
    List<GananciaDiaria> getAllGanancias();
    List<GananciaDiaria> getByMes(String fecha);
    Optional<GananciaDiaria> find(int id);
}
