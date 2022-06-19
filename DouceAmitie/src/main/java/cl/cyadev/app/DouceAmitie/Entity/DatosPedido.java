package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DatosPedido {

    @Id
    @Column(name = "id_Pedido")
    private int id;
    @Column(name = "direccion_Entrega")
    private String direccion;
    @Column(name = "costo_Total")
    private int costo;
    private String observaciones_Pedido;
    private String estado;
    @Column(name = "fecha_Entrega")
    private LocalDateTime fecha;
    private String rut_Cliente;
    private String rut_Trabajador;

}
