package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pastel {
    private int idPastel;
    private String nombre;
    private String descripcion;
    private int precio;

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
