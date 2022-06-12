package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidosService {

    List<Pedido> getAllPedidos();
    String savePedido(Pedido pedido);
    String updatePedido(Pedido pedido);
    String deletePedido(int id);
    Optional<Pedido> findPedido(int id);
}
