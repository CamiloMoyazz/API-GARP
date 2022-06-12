package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.Pasteles_Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("pastelesPedidosRepository")
public interface PastelesPedidosRepository extends JpaRepository<Pasteles_Pedidos, Serializable> {
//    List<Pasteles_Pedidos> findByPedido(int Pedido);
}
