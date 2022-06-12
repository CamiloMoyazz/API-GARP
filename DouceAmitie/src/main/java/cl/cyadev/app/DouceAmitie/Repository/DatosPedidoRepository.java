package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("datosPedidoRepository")
public interface DatosPedidoRepository extends JpaRepository<DatosPedido, Serializable> {
    @Query(value = "SELECT id_Pedido FROM pedidos ORDER BY id_Pedido DESC LIMIT 1",nativeQuery = true)
    int ultimoIdPedido();
}
