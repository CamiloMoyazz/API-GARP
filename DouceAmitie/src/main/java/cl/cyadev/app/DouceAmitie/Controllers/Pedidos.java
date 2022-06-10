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

    @GetMapping("/datosPedidos")
    public List<DatosPedido> getAllDatos(){return servicePedidos.datosPedido();}
    @GetMapping("/hola")
    public String hola(){
        return "Hola desde Pedidos!";
    }

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

    @PutMapping("/actualizarCliente")
    public String Actualizar(@RequestBody Cliente c){
        try{
            service.update(c);
            return "EXITO!";
        }catch (Exception ex){
            return "ERROR!";
        }
    }


//    @DeleteMapping("/eliminarCliente/{rut}")
//    public String Eliminar(@PathVariable String rut){
//        Cliente c = service.getById(rut);
//
//    }
}
