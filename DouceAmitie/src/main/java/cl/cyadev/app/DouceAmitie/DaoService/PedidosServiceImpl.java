package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import cl.cyadev.app.DouceAmitie.Entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("pedidosService")
public class PedidosServiceImpl implements PedidosService{

    @Autowired
    @Qualifier("datosPedidoService")
    private DatosPedidoService datosService;

    @Autowired
    @Qualifier("clienteService")
    private ClienteService clienteService;

    @Autowired
    @Qualifier("trabajadorService")
    private TrabajadorService trabajadorService;


    @Override
    public List<Pedido> getAllPedidos() {
        List<DatosPedido> datosPedidos = datosService.datosPedido();
        List<Pedido> pedidos = new ArrayList<>();

        //Recorremos la lista de datos
        for(DatosPedido p : datosPedidos){
            Pedido pe = new Pedido();
            pe.setId_Pedido(p.getId());
            pe.setCliente(clienteService.getById(p.getRut_Cliente()));
            pe.setDireccion_Entrega(p.getDireccion());
            pe.setFecha_Entrega(p.getFecha());
            //Recorremos Pasteles que van en el pedido

            pe.setObservaciones_Pedido(p.getObservaciones_Pedido());
            pe.setObservaciones_Entrega(p.getObservaciones_Entrega());
            pe.setEstado(p.getEstado());
            pe.setEncargado(trabajadorService.getById(p.getRut_Trabajador()));

            pedidos.add(pe);
        }

        return null;
    }

    @Override
    public String savePedido(Pedido pedido) {
        return null;
    }

    @Override
    public String updatePedido(Pedido pedido) {
        return null;
    }

    @Override
    public String deletePedido(int id) {
        return null;
    }

    @Override
    public Optional<Pedido> findPedido(int id) {
        return Optional.empty();
    }
}
