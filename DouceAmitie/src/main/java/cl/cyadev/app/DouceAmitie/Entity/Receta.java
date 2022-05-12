package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Receta {
    private int idReceta;
    private File imagen;
    private String nombre;
    private List<String> ingredientes;
    private List<String> preparacion;
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
