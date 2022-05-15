package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("trabajadorRepository")
public interface TrabajadoRepository extends JpaRepository<Trabajador, Serializable> {
}
