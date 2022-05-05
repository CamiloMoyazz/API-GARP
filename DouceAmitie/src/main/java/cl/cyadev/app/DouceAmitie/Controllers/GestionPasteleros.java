package cl.cyadev.app.DouceAmitie.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Pasteleros")
public class GestionPasteleros {

    @GetMapping("/hola")
    public String Hola(){
        return "Hola desde pesteleros";
    }
}
