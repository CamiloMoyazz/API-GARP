package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("pastelService")
public class PastelServiceImpl implements PastelService{
    @Override
    public Pastel save(Pastel pastel) {
        return null;
    }

    @Override
    public Pastel delete(int id) {
        return null;
    }

    @Override
    public Pastel update(Pastel pastel) {
        return null;
    }

    @Override
    public List<Pastel> pastelList() {
        return null;
    }

    @Override
    public Optional<Pastel> find() {
        return Optional.empty();
    }
}
