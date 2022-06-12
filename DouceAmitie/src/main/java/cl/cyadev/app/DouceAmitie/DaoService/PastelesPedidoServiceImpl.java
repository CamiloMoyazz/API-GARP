package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pasteles_Pedidos;
import cl.cyadev.app.DouceAmitie.Repository.PastelesPedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("pastelesPedidos")
public class PastelesPedidoServiceImpl implements PastelesPedidoService{

    @Autowired
    @Qualifier("pastelesPedidosRepository")
    private PastelesPedidosRepository repository;

    @Override
    public List<Pasteles_Pedidos> getAllByPedido(int id) {
        return repository.findByPedido(id);
    }

    @Override
    public String save(Pasteles_Pedidos pasteles_pedidos) {
        repository.save(pasteles_pedidos);
        return "EXITO!";
    }
    @Override
    public String update(Pasteles_Pedidos p) {
        if(find(p.getId_Pedido_Pastel()).isPresent()){
            repository.save(p);
        }
        return "EXITO!";
    }

    @Override
    public String Delete(int idPedido) {
        repository.deletePastelesPedido(idPedido);
        return "ELIMINADO!";
    }

    @Override
    public Optional<Pasteles_Pedidos> find(int id) {
        return repository.findById(id);
    }
}
