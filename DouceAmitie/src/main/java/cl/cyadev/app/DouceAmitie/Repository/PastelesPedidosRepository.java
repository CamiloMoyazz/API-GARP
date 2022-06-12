package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.Pasteles_Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("pastelesPedidosRepository")
public interface PastelesPedidosRepository extends JpaRepository<Pasteles_Pedidos, Serializable> {
   @Query(value = "SELECT * FROM pedidos_pasteles WHERE Pedido = ?1", nativeQuery = true)
    List<Pasteles_Pedidos> findByPedido(int Pedido);
   @Query(value = "DELETE FROM pedidos_pasteles WHERE Pedido = ?1",nativeQuery = true)
    void deletePastelesPedido(int id);
}
