package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.TrabajadorService;
import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Login")
public class InicioSesion {
    @Autowired
    @Qualifier("trabajadorService")
    private TrabajadorService service;

    @CrossOrigin(origins = "*")
    @GetMapping("/hola")
    public String Hola(){
        return "Hola desde Login";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public Trabajador verificarCredenciales(@RequestBody Trabajador trabajador){

        if(service.existeTrabajador(trabajador.getRut())){
            Trabajador t = service.getById(trabajador.getRut());
            Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
             if(argon2.verify(t.getPassword(), trabajador.getPassword())){
                 return t;
             }
        }
        return null;
    }
}
