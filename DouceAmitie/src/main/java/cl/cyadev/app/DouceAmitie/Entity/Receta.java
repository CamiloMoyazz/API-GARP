package cl.cyadev.app.DouceAmitie.Entity;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recetas")
@Data
public class Receta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReceta")
    private int idReceta;
    @Column(name = "urlImagen")
    private String imagen;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ingredientes")
    private List<String> ingredientes;
    @Column(name = "preparacion")
    private List<String> preparacion;
    @Column(name = "urlVideo")
    private String urlVideo;
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
