package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

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
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @Column(name = "password")
    private String password;
    @Column(name = "fechaIngreso")
    private Date fechaIngreso;
    @Column(name = "idRol")
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
