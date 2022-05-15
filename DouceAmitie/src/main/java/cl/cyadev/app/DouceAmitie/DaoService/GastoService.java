package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GastoDiario;

import java.util.List;
import java.util.Optional;

public interface GastoService {
    GastoDiario save(GastoDiario gasto);
    GastoDiario delete(int id);
    GastoDiario update(GastoDiario gasto);
    List<GastoDiario> gastoDiarioList();
    Optional<GastoDiario> find();
}
