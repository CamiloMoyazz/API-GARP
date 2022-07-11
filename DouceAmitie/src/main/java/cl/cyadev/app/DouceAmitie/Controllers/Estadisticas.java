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

    @CrossOrigin(origins = "*")
    @GetMapping("/hola")
    public String Hola(){
        return "Hola desde Estadisticas";
    }


    // ------ SECCION GASTOS -------

    @CrossOrigin(origins = "*")
    @GetMapping("/getGastos")
    public List<GastoDiario> gastos(){
        return gastoService.getGastos();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getGastosAnio/{anio}")
    public List<GastoDiario> gastosAnio(@PathVariable String anio){
        String fecha1 = "-01-01";
        String fecha = anio + fecha1;
        return gastoService.getGastosByMes(fecha);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/prueba")
    public int prueba(){
       return 1;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/getGasto/{fecha}")
    public List<GastoDiario> gastosMes(@PathVariable String fecha){
       return gastoService.getGastosByMes(fecha);
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/ingresarGasto")
    public String ingresarGasto(@RequestBody GastoDiario gastoDiario){
        gastoService.save(gastoDiario);
        return "EXITO!";
    }
    @CrossOrigin(origins = "*")
    @PutMapping("/actualizarGasto")
    public String actualizarGasto(@RequestBody GastoDiario gastoDiario){
        gastoService.update(gastoDiario);
        return "EXITOO!";
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/eliminarGasto/{id}")
    public String eliminarGasto(@PathVariable int id){
        gastoService.delete(id);
        return "EXITO!! ELIMINADO!";
    }

    // ------ SECCION GANANCIAS -----

    @CrossOrigin(origins = "*")
    @GetMapping("/getGanancias")
    public List<GananciaDiaria> allGanancias(){
        return gananciaService.getAllGanancias();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/getGananciasAnio/{anio}")
    public List<GananciaDiaria> gananciaAnio(@PathVariable String anio){
        String fecha1 = "-01-01";
        String fecha = anio + fecha1;
        return gananciaService.getByMes(fecha);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/getGanancia/{fecha}")
    public List<GananciaDiaria> gananciasMes(@PathVariable String fecha){
        return gananciaService.getByMes(fecha);
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/ingresarGanancia")
    public String ingresarGanancia(@RequestBody GananciaDiaria gananciaDiaria){
        gananciaService.save(gananciaDiaria);
        return "EXITO!";
    }
    @CrossOrigin(origins = "*")
    @PutMapping("/actualizarGanancia")
    public String actualizarGanancia(@RequestBody GananciaDiaria gananciaDiaria){
        gananciaService.update(gananciaDiaria);
        return "ACTUALIZADO!!";
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping("/eliminarGanancia/{id}")
    public String eliminarGanancia(@PathVariable int id){
        gananciaService.delete(id);
        return "ELIMINADO!";
    }
}
