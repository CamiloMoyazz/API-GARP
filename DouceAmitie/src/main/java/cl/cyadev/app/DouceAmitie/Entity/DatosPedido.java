package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DatosPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Pedido")
    private int id;
    @Column(name = "direccion_Entrega")
    private String direccion;
    @Column(name = "fecha_Entrega")
    private String fecha;
    @Column(name = "costo_Total")
    private int costo;
    private String observaciones_Pedido;
    private String observaciones_Entrega;
    private String estado;
    private String rut_Cliente;
    private String rut_Trabajador;

}
