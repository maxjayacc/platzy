package pe.mpfn.project.persintence.crud;

import org.springframework.data.repository.CrudRepository;
import pe.mpfn.project.persintence.entity.Boleta;

import java.util.List;
import java.util.Optional;

public interface BoletaCrudRepository  extends CrudRepository<Boleta, Integer> {

    Optional<List<Boleta>> findByPersonal(String personalId);



}
