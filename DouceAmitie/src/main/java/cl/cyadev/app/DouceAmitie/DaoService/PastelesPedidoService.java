package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pasteles_Pedidos;

import java.util.List;
import java.util.Optional;

public interface PastelesPedidoService {
    List<Pasteles_Pedidos> getAllByPedido(int id);
    String save(Pasteles_Pedidos pasteles_pedidos);
    String update(Pasteles_Pedidos p);
    String Delete(int idPedido);
    Optional<Pasteles_Pedidos> find(int idPedido);
}
