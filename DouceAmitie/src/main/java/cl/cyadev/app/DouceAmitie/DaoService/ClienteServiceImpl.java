package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Cliente;
import cl.cyadev.app.DouceAmitie.Entity.Pedido;
import cl.cyadev.app.DouceAmitie.Repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    @Qualifier("clienteRepository")
    private ClienteRepository repository;

    @Override
    public String save(Cliente cliente) {
        repository.save(cliente);
        return "EXITO!";
    }
    @Override
    public String delete(Cliente cliente) {
        repository.deleteById(cliente.getRut());
        return "ELIMINADO!";
    }
    @Override
    public String update(Cliente cliente) {
        if(find(cliente.getRut()).isPresent()){
            repository.save(cliente);
            return "EXITO!";
        }else {
            return "ERROR!";
        }
    }
    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente getById(String rut) {
        return repository.getById(rut);
    }

    @Override
    public Optional<Cliente> find(String rut) {
        return repository.findById(rut);
    }
}
