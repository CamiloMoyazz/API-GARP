package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gastos_diarios")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GastoDiario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Gasto_Diario")
    private int id;
    @Column(name = "gasto_Diario")
    private int gastoDiario;
    @Column(name = "fecha_Gasto")
    private String fechaGasto;

}
