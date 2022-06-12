package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import cl.cyadev.app.DouceAmitie.Repository.DatosPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("datosPedidoService")
public class DatosPedidoImp implements DatosPedidoService{
    @Autowired
    @Qualifier("datosPedidoRepository")
    private DatosPedidoRepository repository;

    @Override
    public List<DatosPedido> datosPedido() {
        return repository.findAll();
    }
    @Override
    public String save(DatosPedido datosPedido) {
        repository.save(datosPedido);
        return "Exito!";
    }
    @Override
    public String update(DatosPedido datosPedido) {
        if(findDatosPedido(datosPedido.getId()).isPresent()){
            repository.save(datosPedido);
            return "Exito!";
        }else {
            return "ERROR!";
        }
    }
    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "ELIMINADO!";
    }
    @Override
    public Optional<DatosPedido> findDatosPedido(int id) {
        return repository.findById(id);
    }
}
