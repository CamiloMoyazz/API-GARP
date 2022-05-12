package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente save(Cliente cliente);
    Cliente delete(String rut);
    Cliente update(Cliente cliente);
    List<Cliente> clienteList();
    Optional<Cliente> find(String rut);
}
