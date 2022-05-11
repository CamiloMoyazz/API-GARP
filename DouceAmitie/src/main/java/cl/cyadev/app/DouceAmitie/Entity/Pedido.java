package cl.cyadev.app.DouceAmitie.Entity;

import java.time.LocalDate;
import java.util.Date;

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

    public Pedido(int idPedido, String nombreCliente, String apellidoPaternoCliente,
                  String apellidoMaternoCliente, String telefonoContacto,
                  String direccionEntrega, LocalDate fechaEntrega, Pastel pastel, int cantidadPedido,
                  String observacionesPedido, String observacionesEntrega, String estado, Trabajador encargado) {
        this.idPedido = idPedido;
        this.nombreCliente = nombreCliente;
        this.apellidoPaternoCliente = apellidoPaternoCliente;
        this.apellidoMaternoCliente = apellidoMaternoCliente;
        this.telefonoContacto = telefonoContacto;
        this.direccionEntrega = direccionEntrega;
        this.fechaEntrega = fechaEntrega;
        this.pastel = pastel;
        this.cantidadPedido = cantidadPedido;
        this.observacionesPedido = observacionesPedido;
        this.observacionesEntrega = observacionesEntrega;
        this.estado = estado;
        this.encargado = encargado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoPaternoCliente() {
        return apellidoPaternoCliente;
    }

    public void setApellidoPaternoCliente(String apellidoPaternoCliente) {
        this.apellidoPaternoCliente = apellidoPaternoCliente;
    }

    public String getApellidoMaternoCliente() {
        return apellidoMaternoCliente;
    }

    public void setApellidoMaternoCliente(String apellidoMaternoCliente) {
        this.apellidoMaternoCliente = apellidoMaternoCliente;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Pastel getPastel() {
        return pastel;
    }

    public void setPastel(Pastel pastel) {
        this.pastel = pastel;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public String getObservacionesPedido() {
        return observacionesPedido;
    }

    public void setObservacionesPedido(String observacionesPedido) {
        this.observacionesPedido = observacionesPedido;
    }

    public String getObservacionesEntrega() {
        return observacionesEntrega;
    }

    public void setObservacionesEntrega(String observacionesEntrega) {
        this.observacionesEntrega = observacionesEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Trabajador getEncargado() {
        return encargado;
    }

    public void setEncargado(Trabajador encargado) {
        this.encargado = encargado;
    }

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
