package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gananciasdiarias")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GananciaDiaria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGananciaDiaria")
    private int id;
    @Column(name = "gananciaDiaria")
    private int gananciaDiaria;
    @Column(name = "fechaGanancia")
    private Date fechaGanancia;

    @Override
    public String toString() {
        return "GananciaDiaria{" +
                "id=" + id +
                ", gananciaDiaria=" + gananciaDiaria +
                ", fechaGanancia=" + fechaGanancia +
                '}';
    }
}
