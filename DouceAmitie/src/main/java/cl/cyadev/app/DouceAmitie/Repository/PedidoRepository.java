package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("pedidoRepository")
public interface PedidoRepository extends JpaRepository<Pedido, Serializable> {
}
