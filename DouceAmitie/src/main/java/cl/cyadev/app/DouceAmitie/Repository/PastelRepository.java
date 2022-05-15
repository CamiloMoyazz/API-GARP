package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("pastelRepository")
public interface PastelRepository extends JpaRepository<Pastel, Serializable> {
}
