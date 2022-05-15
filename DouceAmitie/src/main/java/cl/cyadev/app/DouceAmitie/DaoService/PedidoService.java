package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido save(Pedido pedido);
    Pedido delete(int id);
    Pedido update(Pedido pedido);
    List<Pedido> pedidosList();
    List<Pedido> find();
}
