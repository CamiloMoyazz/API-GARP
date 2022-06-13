package cl.cyadev.app.DouceAmitie.Controllers;

import cl.cyadev.app.DouceAmitie.DaoService.GananciaService;
import cl.cyadev.app.DouceAmitie.DaoService.GastoService;
import cl.cyadev.app.DouceAmitie.Entity.GananciaDiaria;
import cl.cyadev.app.DouceAmitie.Entity.GastoDiario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Estadisticas")

public class Estadisticas {
    @Autowired
    @Qualifier("gastoService")
    private GastoService gastoService;

    @Autowired
    @Qualifier("gananciaService")
    private GananciaService gananciaService;

    @GetMapping("/hola")
    public String Hola(){
        return "Hola desde Estadisticas";
    }


    // ------ SECCION GASTOS -------

    @GetMapping("/getGastos")
    public List<GastoDiario> gastos(){
        return gastoService.getGastos();
    }

    @GetMapping("/prueba")
    public int prueba(){
       return 1;
    }
    @GetMapping("/getGasto/{fecha}")
    public List<GastoDiario> gastosMes(@PathVariable String fecha){
       return gastoService.getGastosByMes(fecha);
    }
    @PostMapping("/ingresarGasto")
    public String ingresarGasto(@RequestBody GastoDiario gastoDiario){
        gastoService.save(gastoDiario);
        return "EXITO!";
    }

    @PutMapping("/actualizarGasto")
    public String actualizarGasto(@RequestBody GastoDiario gastoDiario){
        gastoService.update(gastoDiario);
        return "EXITOO!";
    }

    @DeleteMapping("/eliminarGasto/{id}")
    public String eliminarGasto(@PathVariable int id){
        gastoService.delete(id);
        return "EXITO!! ELIMINADO!";
    }

    // ------ SECCION GANANCIAS -----

    @GetMapping("/getGanancias")
    public List<GananciaDiaria> allGanancias(){
        return gananciaService.getAllGanancias();
    }
    @GetMapping("/getGanancia/{fecha}")
    public List<GananciaDiaria> gananciasMes(@PathVariable String fecha){
        return gananciaService.getByMes(fecha);
    }
    @PostMapping("/ingresarGanancia")
    public String ingresarGanancia(@RequestBody GananciaDiaria gananciaDiaria){
        gananciaService.save(gananciaDiaria);
        return "EXITO!";
    }
    @PutMapping("/actualizarGanancia")
    public String actualizarGanancia(@RequestBody GananciaDiaria gananciaDiaria){
        gananciaService.update(gananciaDiaria);
        return "ACTUALIZADO!!";
    }
    @DeleteMapping("/eliminarGanancia/{id}")
    public String eliminarGanancia(@PathVariable int id){
        gananciaService.delete(id);
        return "ELIMINADO!";
    }
}
