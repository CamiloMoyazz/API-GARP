package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ganancias_diarias")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GananciaDiaria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ganancia_diaria")
    private int id;
    @Column(name = "ganancia_diaria")
    private int gananciaDiaria;
    @Column(name = "fecha_ganancia")
    private String fechaGanancia;

}
