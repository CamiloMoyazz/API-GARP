package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.TrabajadorService;
import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Pasteleros")
public class GestionPasteleros {

    @Autowired
    @Qualifier("trabajadorService")
    private TrabajadorService service;
    @GetMapping("/hola")
    public String Hola(){
      return "Hola desde pasteleros";
    }

    //Trae a todos los Trabajadores y retorna una lista de ellos
    @GetMapping("/getAll")
    public List<Trabajador> getAll(){
        return service.getAll();
    }

    @GetMapping("/getPasteleros")
    public List<Trabajador> pasteleros(){
        return service.getPasteleros();
    }

    @GetMapping("/getAdministradores")
    public List<Trabajador> admins(){
        return service.getAdministradores();
    }

    //Actualiza un Trabajador
    @PutMapping("/actualizar")
    public String Actualizar(@RequestBody Trabajador t){
        try{
            service.update(t);
            return "EXITO1!";
        }catch (Exception ex){
            return "ERROR!";
        }
    }

    //Verifica si el Trabajador Existe y luego lo elimina.
    @DeleteMapping("/eliminar/{rut}")
    public String Eliminar(@PathVariable String rut){
        Trabajador t = service.getById(rut);
        service.delete(t);
        return "Eliminado con Exito!";
    }
}
