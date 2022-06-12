package cl.cyadev.app.DouceAmitie.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pasteles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pastel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Pastel")
    private int idPastel;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private int precio;

    @Transient
    private int cantidad;

    @Override
    public String toString() {
        return "Pastel{" +
                "idPastel=" + idPastel +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
