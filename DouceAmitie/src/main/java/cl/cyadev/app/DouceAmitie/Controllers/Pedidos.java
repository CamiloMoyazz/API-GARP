package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.ClienteService;
import cl.cyadev.app.DouceAmitie.DaoService.DatosPedidoService;
import cl.cyadev.app.DouceAmitie.DaoService.PastelesPedidoService;
import cl.cyadev.app.DouceAmitie.Entity.*;
import cl.cyadev.app.DouceAmitie.Repository.PastelesPedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Pedidos")
public class Pedidos {

    @Autowired
    @Qualifier("clienteService")
    private ClienteService service;

    @Autowired
    @Qualifier("datosPedidoService")
    private DatosPedidoService servicePedidos;

    @Autowired
    @Qualifier("pastelesPedidos")
    private PastelesPedidoService servicePasteles;

    @Autowired
    @Qualifier("pastelesPedidosRepository")
    private PastelesPedidosRepository repoPastel;

    @GetMapping("/hola")
    public String hola(){
        return "Hola desde Pedidos!";
    }


    // ----- SECCION PEDIDOS --------
    @GetMapping("/datosPedidos")
    public List<DatosPedido> getAllDatos(){return servicePedidos.datosPedido();}



    // ------ SECCION CLIENTES -------

    @GetMapping("/getClientes")
    public List<Cliente> getAll(){
        return service.getAll();
    }

    @PostMapping("/registrarCliente")
    public String registrarCliente(@RequestBody Cliente cliente){
        try{
            service.save(cliente);
            return "Cliente Registrado!";
        }catch (Exception ex){
            return "Error!";
        }
    }

}
