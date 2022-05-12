package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente delete(String rut) {
        return null;
    }

    @Override
    public Cliente update(Cliente cliente) {
        return null;
    }

    @Override
    public List<Cliente> clienteList() {
        return null;
    }

    @Override
    public Optional<Cliente> find(String rut) {
        return Optional.empty();
    }
}
