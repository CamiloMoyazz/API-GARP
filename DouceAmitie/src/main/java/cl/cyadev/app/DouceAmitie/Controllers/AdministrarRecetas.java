package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.PastelService;
import cl.cyadev.app.DouceAmitie.DaoService.RecetaService;
import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import cl.cyadev.app.DouceAmitie.Entity.Receta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Recetas")
public class AdministrarRecetas {

    @Autowired
    @Qualifier("pastelService")
    private PastelService pastelService;

    @Autowired
    @Qualifier("recetaService")
    private RecetaService recetaService;

    @GetMapping("/hola")
    public String Hola(){
        return "Hola desde Recetas";
    }

    // --- METODOS PARA RECETAS ---

    @GetMapping("/getRecetas")
    public List<Receta> recetas(){
        return recetaService.getRecetas();
    }
    @PostMapping("/ingresarReceta")
    public String ingresarReceta(@RequestBody Receta receta){
        recetaService.save(receta);
        return "INGRESADO!";
    }
    @PutMapping("/actualizarReceta")
    public String actualizarReceta(@RequestBody Receta receta){
        recetaService.update(receta);
        return "Actualizado!";
    }
    @DeleteMapping("/eliminarReceta/{id}")
    public String eliminarReceta(@PathVariable int id){
        recetaService.delete(id);
        return "ELIMINADO!";
    }

    // --- METODOS PARA PASTELES ---
    @GetMapping("/getPasteles")
    public List<Pastel> pasteles(){
        return pastelService.getAll();
    }
    @PostMapping("/ingresarPastel")
    public String ingresarPastel(@RequestBody Pastel pastel){
        pastelService.save(pastel);
        return "Pastel Ingresado!";
    }
    @PutMapping("/actualizarPastel")
    public String actualizarPastel(@RequestBody Pastel pastel){
        pastelService.update(pastel);
        return "Pastel Actualizado!";
    }
    @DeleteMapping("/eliminarPastel/{id}")
    public String eliminarPastel(@PathVariable int id){
        pastelService.delete(id);
        return "ELIMINADO CON EXITO!";
    }
}
