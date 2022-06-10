package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import cl.cyadev.app.DouceAmitie.Repository.DatosPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("datosPedidoService")
public class DatosPedidoImp implements DatosPedidoService{
    @Autowired
    @Qualifier("datosPedidoRepository")
    private DatosPedidoRepository repository;

    @Override
    public List<DatosPedido> datosPedido() {
        return repository.findAll();
    }
}
