package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.GastoDiario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("gastoService")
public class GastoServiceImpl implements GastoService{
    @Override
    public GastoDiario save(GastoDiario gasto) {
        return null;
    }

    @Override
    public GastoDiario delete(int id) {
        return null;
    }

    @Override
    public GastoDiario update(GastoDiario gasto) {
        return null;
    }

    @Override
    public List<GastoDiario> gastoDiarioList() {
        return null;
    }

    @Override
    public Optional<GastoDiario> find() {
        return Optional.empty();
    }
}
