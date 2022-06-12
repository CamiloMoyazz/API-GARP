package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import cl.cyadev.app.DouceAmitie.Entity.Pasteles_Pedidos;
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

    @Autowired
    @Qualifier("pastelesPedidos")
    private PastelesPedidoService pastelesPedidoService;


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
            pe.setPasteles(pastelesPedidoService.getAllByPedido(p.getId()));
            pe.setObservaciones_Pedido(p.getObservaciones_Pedido());
            pe.setObservaciones_Entrega(p.getObservaciones_Entrega());
            pe.setEstado(p.getEstado());
            pe.setEncargado(trabajadorService.getById(p.getRut_Trabajador()));
            pe.getEncargado().setPassword(null);
            pedidos.add(pe);
        }
        return pedidos;
    }

    @Override
    public String savePedido(Pedido pedido) {
        int costoTotal = 0;
        DatosPedido datos = new DatosPedido();
        datos.setId(datosService.ultimoIdPedido()+1);
        datos.setDireccion(pedido.getDireccion_Entrega());
        datos.setFecha(pedido.getFecha_Entrega());
        List<Pasteles_Pedidos> pasteles = pedido.getPasteles();
        for (Pasteles_Pedidos p : pasteles){
            costoTotal+=p.getValor();
        }
        datos.setCosto(costoTotal);
        datos.setObservaciones_Pedido(pedido.getObservaciones_Pedido());
        datos.setObservaciones_Entrega(pedido.getObservaciones_Entrega());
        datos.setEstado(pedido.getEstado());
        datos.setRut_Cliente(pedido.getCliente().getRut());
        datos.setRut_Trabajador(pedido.getEncargado().getRut());

        System.out.println(datos);
        datosService.save(datos);
        for (Pasteles_Pedidos p : pasteles){
            p.setPedido(datos.getId());
            pastelesPedidoService.save(p);
       }
        return "Exito!";
    }

    @Override
    public String updatePedido(Pedido pedido) {
        if(findPedido(pedido.getId_Pedido()).isPresent()){
            int costoTotal = 0;
            DatosPedido datos = new DatosPedido();
            datos.setId(pedido.getId_Pedido());
            datos.setDireccion(pedido.getDireccion_Entrega());
            datos.setFecha(pedido.getFecha_Entrega());
            List<Pasteles_Pedidos> pasteles = pedido.getPasteles();
            for (Pasteles_Pedidos p : pasteles){
                costoTotal+=p.getValor();
            }
            datos.setCosto(costoTotal);
            datos.setObservaciones_Pedido(pedido.getObservaciones_Pedido());
            datos.setObservaciones_Entrega(pedido.getObservaciones_Entrega());
            datos.setEstado(pedido.getEstado());
            datos.setRut_Cliente(pedido.getCliente().getRut());
            datos.setRut_Trabajador(pedido.getEncargado().getRut());

            System.out.println(datos);
            datosService.save(datos);
            for (Pasteles_Pedidos p : pasteles){
                p.setPedido(datos.getId());
                pastelesPedidoService.save(p);
            }
            datosService.save(datos);

            return "ACTUALIZADO";
        }else {
            return "ERROR!";
        }

    }

    @Override
    public String deletePedido(int id) {
        return null;
    }

    @Override
    public Optional<DatosPedido> findPedido(int id) {
        return datosService.findDatosPedido(id);
    }
}
