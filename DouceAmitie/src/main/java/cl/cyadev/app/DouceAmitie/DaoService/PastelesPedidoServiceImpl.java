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
        return null;
    }

    @Override
    public String save(Pasteles_Pedidos p) {
        return null;
    }

    @Override
    public String update(Pasteles_Pedidos p) {
        return null;
    }

    @Override
    public String Delete(int idPedido) {
        return null;
    }

    @Override
    public Optional<Pasteles_Pedidos> find(int idPedido) {
        return Optional.empty();
    }
}
