package cl.cyadev.app.DouceAmitie.Entity;

import java.math.BigDecimal;
import java.util.Date;

public class GananciaDiaria {
    private int id;
    private BigDecimal gananciaDiaria;
    private Date fechaGanancia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getGananciaDiaria() {
        return gananciaDiaria;
    }

    public void setGananciaDiaria(BigDecimal gananciaDiaria) {
        this.gananciaDiaria = gananciaDiaria;
    }

    public Date getFechaGanancia() {
        return fechaGanancia;
    }

    public void setFechaGanancia(Date fechaGanancia) {
        this.fechaGanancia = fechaGanancia;
    }

    @Override
    public String toString() {
        return "GananciaDiaria{" +
                "id=" + id +
                ", gananciaDiaria=" + gananciaDiaria +
                ", fechaGanancia=" + fechaGanancia +
                '}';
    }
}
