package cl.cyadev.app.DouceAmitie.Entity;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "recetas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Receta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Receta")
    private int idReceta;
    @Column(name = "url_Imagen")
    private String imagen;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "categoria")
    private String categoria;
    @Column(name = "ingredientes")
    private String ingredientes;
    @Column(name = "preparacion")
    private String preparacion;
    @Column(name = "url_Video")
    private String urlVideo;

    @Column(name = "id_Pastel")
    private int id_Pastel;
    @Override
    public String toString() {
        return "Pastel{" +
                "idReceta=" + idReceta +
                ", imagen=" + imagen +
                ", nombre='" + nombre + '\'' +
                ", ingredientes=" + ingredientes +
                ", preparacion=" + preparacion +
                ", urlVideo='" + urlVideo + '\'' +
                '}';
    }
}
