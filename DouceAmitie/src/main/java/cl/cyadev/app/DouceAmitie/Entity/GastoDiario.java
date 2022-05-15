package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gastosdiarios")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GastoDiario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGastoDiario")
    private int id;
    @Column(name = "gastoDiario")
    private int gastoDiario;
    @Column(name = "fechaGasto")
    private Date fechaGasto;

    @Override
    public String toString() {
        return "GastoDiario{" +
                "id=" + id +
                ", gastoDiario=" + gastoDiario +
                ", fechaGasto=" + fechaGasto +
                '}';
    }
}
