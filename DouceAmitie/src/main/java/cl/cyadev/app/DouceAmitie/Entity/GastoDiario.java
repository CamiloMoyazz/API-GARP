package cl.cyadev.app.DouceAmitie.Entity;

import java.math.BigDecimal;
import java.util.Date;

public class GastoDiario {
    private int id;
    private BigDecimal gastoDiario;
    private Date fechaGasto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getGastoDiario() {
        return gastoDiario;
    }

    public void setGastoDiario(BigDecimal gastoDiario) {
        this.gastoDiario = gastoDiario;
    }

    public Date getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(Date fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    @Override
    public String toString() {
        return "GastoDiario{" +
                "id=" + id +
                ", gastoDiario=" + gastoDiario +
                ", fechaGasto=" + fechaGasto +
                '}';
    }
}
