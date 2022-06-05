package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.TrabajadorService;
import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
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

    //Trae a todos los Trabajadores y retorna una lista de ellos
    @GetMapping("/getAll")
    public List<Trabajador> getAll(){
        return service.getAll();
    }
    //Recibe un Json con un Trabajador y lo registra Encriptando su contraseña
    @PostMapping("/registrar")
    public String Registrar(@RequestBody Trabajador t){
        try{

            Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
            String newPass = argon2.hash(1,1024,1,t.getPassword());
            t.setPassword(newPass);
            service.save(t);
            return "Registro Exitoso";
        }catch (Exception ex){
            return "Error, Intentalo Otra Vez";
        }
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
