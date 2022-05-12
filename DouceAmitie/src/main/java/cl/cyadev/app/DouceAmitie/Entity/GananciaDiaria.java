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
public class GananciaDiaria {
    private int id;
    private BigDecimal gananciaDiaria;
    private Date fechaGanancia;

    @Override
    public String toString() {
        return "GananciaDiaria{" +
                "id=" + id +
                ", gananciaDiaria=" + gananciaDiaria +
                ", fechaGanancia=" + fechaGanancia +
                '}';
    }
}
