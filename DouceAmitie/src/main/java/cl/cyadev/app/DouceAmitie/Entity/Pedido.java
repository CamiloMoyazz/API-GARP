package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    private int id_Pedido;
    private Cliente cliente;
    private String direccion_Entrega;
    private String fecha_Entrega;
    private List<Pastel> pasteles;
    private String observaciones_Pedido;
    private String observaciones_Entrega;
    private String estado;
    private Trabajador encargado;
}
