package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("datosPedidoRepository")
public interface DatosPedidoRepository extends JpaRepository<DatosPedido, Serializable> {
}
