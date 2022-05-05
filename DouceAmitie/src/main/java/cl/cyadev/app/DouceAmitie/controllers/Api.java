package cl.cyadev.app.DouceAmitie.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Api {

    @RequestMapping("/hello")
    public String hello(){
        return "Hola Mundo!";
    }
}
