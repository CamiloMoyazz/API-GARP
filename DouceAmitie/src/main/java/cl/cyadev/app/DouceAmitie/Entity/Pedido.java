package cl.cyadev.app.DouceAmitie.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    private int id_Pedido;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private String datos_cliente;
    private String direccion_Entrega;
    private LocalDateTime fecha_Entrega;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Pasteles_Pedidos> pasteles;
    private List<String> nombresPasteles;
    private int valor_total;
    private String observaciones_Pedido;
    private String estado;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private String datos_encargado;
}
