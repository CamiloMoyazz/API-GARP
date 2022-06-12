package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;

import java.util.List;
import java.util.Optional;

public interface DatosPedidoService {
    List<DatosPedido> datosPedido();
    String save(DatosPedido datosPedido);
    String update(DatosPedido datosPedido);
    String delete(int id);
    Optional<DatosPedido> findDatosPedido(int id);
}
