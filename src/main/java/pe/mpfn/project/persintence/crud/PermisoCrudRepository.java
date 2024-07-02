package pe.mpfn.project.persintence.crud;

import org.springframework.data.repository.CrudRepository;
import pe.mpfn.project.persintence.entity.Permiso;
import pe.mpfn.project.persintence.entity.TipoPermiso;

import java.util.List;
import java.util.Optional;

public interface PermisoCrudRepository extends CrudRepository <Permiso,Integer>
{
    List<Permiso> findByIdTipoPermiso(int idTipoPermiso);
    Optional<List<Permiso>> findByCantidadPermisoLessThanAndEstado(int cantidadPermiso,boolean estado);
}