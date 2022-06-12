package cl.cyadev.app.DouceAmitie.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    private int id_Pedido;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cliente cliente;
    private String direccion_Entrega;
    private String fecha_Entrega;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Pasteles_Pedidos> pasteles;
    private String observaciones_Pedido;
    private String observaciones_Entrega;
    private String estado;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Trabajador encargado;
}
