package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.ClienteService;
import cl.cyadev.app.DouceAmitie.DaoService.DatosPedidoService;
import cl.cyadev.app.DouceAmitie.Entity.Cliente;
import cl.cyadev.app.DouceAmitie.Entity.DatosPedido;
import cl.cyadev.app.DouceAmitie.Entity.Pedido;
import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
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
