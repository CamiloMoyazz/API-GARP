package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.Pasteles_Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PastelesPedidosRepository extends JpaRepository<Pasteles_Pedidos, Serializable> {
}
