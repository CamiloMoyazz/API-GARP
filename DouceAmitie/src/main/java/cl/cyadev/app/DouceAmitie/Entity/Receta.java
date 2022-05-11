package cl.cyadev.app.DouceAmitie.Entity;

import java.io.File;
import java.util.List;

public class Receta {
    private int idReceta;
    private File imagen;
    private String nombre;
    private List<String> ingredientes;
    private List<String> preparacion;
    private String urlVideo;

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(List<String> preparacion) {
        this.preparacion = preparacion;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

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
