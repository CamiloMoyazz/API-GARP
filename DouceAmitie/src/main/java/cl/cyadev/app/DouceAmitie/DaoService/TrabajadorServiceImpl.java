package cl.cyadev.app.DouceAmitie.DaoService;

import cl.cyadev.app.DouceAmitie.Entity.Trabajador;
import cl.cyadev.app.DouceAmitie.Repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("trabajadorService")
public class TrabajadorServiceImpl implements TrabajadorService{

    @Autowired
    @Qualifier("trabajadorRepository")
    private TrabajadorRepository repository;
    @Override
    public String save(Trabajador trabajador) {

        try{
            repository.save(trabajador);
            return "Ingresado con Exito!";
        }catch (Exception ex ){
            return "Se Produjo un Error al Ingresar el Trabajador, Vuelve a intentarlo";
        }

    }
    @Override
    public String delete(Trabajador trabajador) {
        repository.deleteById(trabajador.getRut());
        return "Eliminado con Exito!";
    }
    @Override
    public String update(Trabajador trabajador) {

            if(find(trabajador.getRut()).isPresent()){
                repository.save(trabajador);
            }
            return "Actualizado con Exito!";

    }
    @Override
    public List<Trabajador> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Trabajador> getPasteleros() {
        List<Trabajador> todos = repository.findAll();
        List<Trabajador> pasteleros = new ArrayList<>();

        for (Trabajador t : todos){
            if(t.getPermisos() == 2){
                pasteleros.add(t);
            }
        }
        return pasteleros;
    }

    @Override
    public List<Trabajador> getAdministradores() {
        List<Trabajador> todos = repository.findAll();
        List<Trabajador> admins = new ArrayList<>();

        for (Trabajador t : todos){
            if(t.getPermisos() == 1){
                admins.add(t);
            }
        }
        return admins;
    }

    @Override
    public Trabajador getById(String rut) {
        return repository.getById(rut);
    }

    @Override
    public Boolean existeTrabajador(String rut) {
        if(find(rut).isPresent()){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public Optional<Trabajador> find(String rut) {
        return repository.findById(rut);
    }
}
