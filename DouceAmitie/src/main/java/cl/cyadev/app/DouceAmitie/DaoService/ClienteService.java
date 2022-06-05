package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Cliente;
import cl.cyadev.app.DouceAmitie.Entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    String save(Cliente cliente);
    String delete(Cliente cliente);
    String update(Cliente cliente);
    List<Cliente> getAll();
    Cliente getById(String rut);
    Optional<Cliente> find(String rut);
}
