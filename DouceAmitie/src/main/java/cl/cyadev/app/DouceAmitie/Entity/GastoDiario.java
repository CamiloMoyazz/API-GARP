package cl.cyadev.app.DouceAmitie.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GastoDiario {
    private int id;
    private BigDecimal gastoDiario;
    private Date fechaGasto;

    @Override
    public String toString() {
        return "GastoDiario{" +
                "id=" + id +
                ", gastoDiario=" + gastoDiario +
                ", fechaGasto=" + fechaGasto +
                '}';
    }
}
