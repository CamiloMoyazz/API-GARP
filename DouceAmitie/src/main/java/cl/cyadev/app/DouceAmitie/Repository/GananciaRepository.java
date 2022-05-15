package cl.cyadev.app.DouceAmitie.Repository;

import cl.cyadev.app.DouceAmitie.Entity.GananciaDiaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("gananciaRepository")
public interface GananciaRepository extends JpaRepository<GananciaDiaria, Serializable> {
}
