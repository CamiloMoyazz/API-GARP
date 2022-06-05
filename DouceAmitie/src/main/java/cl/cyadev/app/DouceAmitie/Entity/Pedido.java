package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Pedido;
    private String direccion_Entrega;
    private String fecha_Entrega;
    private int costo_Total;
    private String observaciones_Pedido;
    private String observaciones_Entrega;
    private String estado;
    private String rut_Cliente;
    private String rut_Trabajador;


}
