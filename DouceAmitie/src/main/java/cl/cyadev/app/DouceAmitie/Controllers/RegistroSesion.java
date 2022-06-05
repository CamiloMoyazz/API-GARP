package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.TrabajadorService;
import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Registro")
public class RegistroSesion {

    @Autowired
    @Qualifier("trabajadorService")
    private TrabajadorService service;

    @GetMapping("/hola")
    public String Hola(){
        return "Hola desde Registro";
    }

    @GetMapping("/getAll")
    public List<Trabajador> getAll(){
        return service.getAll();
    }
    @PostMapping("/registrar")
    public String Registrar(@RequestBody Trabajador t){
        try{
            service.save(t);
            return "Registro Exitoso";
        }catch (Exception ex){
            return "Error, Intentalo Otra Vez";
        }
    }
    @PutMapping("/actualizar")
    public String Actualizar(@RequestBody Trabajador t){
        try{
               service.update(t);
               return "EXITO1!";
        }catch (Exception ex){
            return "ERROR!";
        }
    }
    @DeleteMapping("/eliminar/{rut}")
    public String Eliminar(@PathVariable String rut){
        Trabajador t = service.getById(rut);
        service.delete(t);
        return "Eliminado con Exito!";
    }

}
