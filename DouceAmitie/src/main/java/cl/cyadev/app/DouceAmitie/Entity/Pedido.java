package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pedido {
    private int idPedido;
    private String nombreCliente;
    private String apellidoPaternoCliente;
    private String apellidoMaternoCliente;
    private String telefonoContacto;
    private String direccionEntrega;
    private LocalDate fechaEntrega;
    private Pastel pastel;
    private int cantidadPedido;
    private String observacionesPedido;
    private String observacionesEntrega;
    private String estado;
    private Trabajador encargado;

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", apellidoPaternoCliente='" + apellidoPaternoCliente + '\'' +
                ", apellidoMaternoCliente='" + apellidoMaternoCliente + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                ", pastel=" + pastel +
                ", cantidadPedido=" + cantidadPedido +
                ", observacionesPedido='" + observacionesPedido + '\'' +
                ", observacionesEntrega='" + observacionesEntrega + '\'' +
                ", estado='" + estado + '\'' +
                ", encargado=" + encargado.getNombre() + encargado.getApellidoPaterno() +
                '}';
    }
}
