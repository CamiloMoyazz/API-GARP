package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.Entity.Cliente;
import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import cl.cyadev.app.DouceAmitie.Entity.Pedido;
import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
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
    public Pedido Hola(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate localDate = LocalDate.now();


        Trabajador t = new Trabajador("20.780.661-7","Juan","perez","lopez","asdasd","Pastelero");
        Pastel p = new Pastel(1,"Miloja","Delicioso Pastel",2300);
        Pedido pe = new Pedido(1,"pepe","sol","luna","+5691234012"
                ,"Calle Falsa",localDate,p,2,"OJO","OJOmas","Enviado",t);
        return pe;
    }
}
