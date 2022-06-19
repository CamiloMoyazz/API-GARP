package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "trabajadores")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trabajador implements Serializable {
    @Id
    @Column(name = "rut")
    private String rut;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_Paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_Materno")
    private String apellidoMaterno;

    @Column(name = "password")
    private String password;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha_Ingreso")
    private String fechaIngreso;
    @Column(name = "id_Rol")
    private int permisos;
    @Override
    public String toString() {
        return "Trabajador{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", permisos='" + permisos + '\'' +
                '}';
    }
}
