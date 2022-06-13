package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GastoDiario;

import java.util.List;
import java.util.Optional;

public interface GastoService {
    String save(GastoDiario gasto);
    String delete(int id);
    String update(GastoDiario gasto);
    List<GastoDiario> getGastos();
    List<GastoDiario> getGastosByMes(String fecha);
    Optional<GastoDiario> find(int id);
}
