package cl.cyadev.app.DouceAmitie.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@RequestMapping("Pasteleros")
public class GestionPasteleros {

    @GetMapping("/hola")
    public String Hola(){
      return "Hola desde pasteleros";
    }
}
