package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.*;
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
    @Qualifier("pastelService")
    private PastelService pastelService;
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
            Cliente c = clienteService.getById(p.getRut_Cliente());
            Trabajador t = trabajadorService.getById(p.getRut_Trabajador());
            List<String> pasteles = new ArrayList<>();
            int total =0;



            //Creacion de Pedido
            Pedido pe = new Pedido();
            pe.setId_Pedido(p.getId());
            pe.setDatos_cliente(c.getRut()+
                    ","+c.getNombre()+""+c.getApellidoPaterno()+
                    ","+c.getEmail()+
                    ","+c.getTelefono());
            pe.setDireccion_Entrega(p.getDireccion());
            pe.setFecha_Entrega(p.getFecha());
            pe.setPasteles(pastelesPedidoService.getAllByPedido(p.getId()));
            //Recorremos Pasteles que van en el pedido
            for (Pasteles_Pedidos pape : pastelesPedidoService.getAllByPedido(p.getId())){
                Pastel pas = pastelService.getPastelById(pape.getId_Pastel());
                pasteles.add(pas.getNombre());
                total += pape.getValor();
            }
            pe.setValor_total(total);
            pe.setNombresPasteles(pasteles);
            pe.setObservaciones_Pedido(p.getObservaciones_Pedido());
            pe.setEstado(p.getEstado());
            pe.setDatos_encargado(t.getRut()+
                    ","+t.getNombre()+""+t.getApellidoPaterno());
            pedidos.add(pe);
        }
        return pedidos;
    }

    @Override
    public String savePedido(Pedido pedido) {
        int costoTotal = 0;

        //Creamos los datos para la BD
        DatosPedido datos = new DatosPedido();

        datos.setId(datosService.ultimoIdPedido()+1);
        datos.setRut_Cliente(pedido.getDatos_cliente());
        datos.setRut_Trabajador(pedido.getDatos_encargado());
        datos.setDireccion(pedido.getDireccion_Entrega());
        datos.setFecha(pedido.getFecha_Entrega());
        List<Pasteles_Pedidos> pasteles = pedido.getPasteles();
        for (Pasteles_Pedidos p : pasteles){
            costoTotal+=p.getValor();
        }
        datos.setCosto(costoTotal);
        datos.setObservaciones_Pedido(pedido.getObservaciones_Pedido());
        datos.setEstado(pedido.getEstado());

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

            //Creamos los datos para la BD
            DatosPedido datos = new DatosPedido();
            datos.setId(pedido.getId_Pedido());
            datos.setRut_Cliente(pedido.getDatos_cliente());
            datos.setRut_Trabajador(pedido.getDatos_encargado());
            datos.setDireccion(pedido.getDireccion_Entrega());
            datos.setFecha(pedido.getFecha_Entrega());
            List<Pasteles_Pedidos> pasteles = pedido.getPasteles();
            for (Pasteles_Pedidos p : pasteles){
                costoTotal+=p.getValor();
            }
            datos.setCosto(costoTotal);
            datos.setObservaciones_Pedido(pedido.getObservaciones_Pedido());
            datos.setEstado(pedido.getEstado());

            System.out.println(datos);
            datosService.save(datos);
            for (Pasteles_Pedidos p : pasteles){
                pastelesPedidoService.Delete(datos.getId());
            }

            for (Pasteles_Pedidos p : pasteles){
                p.setPedido(datos.getId());
                pastelesPedidoService.save(p);
            }

            return "ACTUALIZADO";
        }else {
            return "ERROR!";
        }

    }

    @Override
    public String deletePedido(int id) {
        if(findPedido(id).isPresent()){
            pastelesPedidoService.Delete(id);
            datosService.delete(id);
            return "EXITO!";
        }else{
            return "Error";
        }

    }

    @Override
    public Optional<DatosPedido> findPedido(int id) {
        return datosService.findDatosPedido(id);
    }
}
