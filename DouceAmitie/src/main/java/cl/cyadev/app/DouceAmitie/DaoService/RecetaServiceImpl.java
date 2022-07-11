package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Pastel;
import cl.cyadev.app.DouceAmitie.Entity.Receta;
import cl.cyadev.app.DouceAmitie.Repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("recetaService")
public class RecetaServiceImpl implements RecetaService{

    @Autowired
    @Qualifier("recetaRepository")
    private RecetaRepository repository;

    //TODO: MODIFICACIONES
    @Autowired
    @Qualifier("pastelService")
    private PastelService pastelService;

    /**
     *La funcion Save recibe un objeto receta como parametro, dentro de la funcion se validan que sus atributos
     * sean validos. Una ves validados es creado el objeto receta y es persistido mediante la clase RecetaRepository
     * con su instancia llamada repository.
     *
     * @param receta Recibe como parametro una clase de tipo Receta.
     * @return Retorna un mensaje de EXITO si se ejecuta con exito el Try, si cae en catch retorna un mensaje de ERROR
     * @author : Camilo Moya
     * @version : 19/05/2022
     *
     */
    @Override
    public String save(Receta receta) {
        try{
            Pastel p = new Pastel();
            p.setNombre(receta.getNombre());
            p.setPrecio(receta.getPrecio());
            p.setDescripcion(receta.getDescripcion());
            pastelService.save(p);
            receta.setId_Pastel(p.getIdPastel());
            repository.save(receta);

            return "Ingresado con EXITO!";
        }catch (Exception ex){
            return "ERROR!";
        }

    }

    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "Eliminado!";
    }

    @Override
    public String update(Receta receta) {
        if(find(receta.getIdReceta()).isPresent()){
            repository.save(receta);
            return "Actualizado!";
        }else {
            return "ERROR!";
        }
    }

    @Override
    public List<Receta> getRecetas() {
        return repository.findAll();
    }

    @Override
    public Optional<Receta> find(int id) {
        return repository.findById(id);
    }
}
