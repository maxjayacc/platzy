package pe.mpfn.project.persintence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.domain.DomainTipoPermiso;
import pe.mpfn.project.domain.repository.PermissionRepository;
import pe.mpfn.project.persintence.crud.PermisoCrudRepository;
import pe.mpfn.project.persintence.entity.Permiso;
import pe.mpfn.project.persintence.mapper.PermisoMapper;
import java.util.List;
import java.util.Optional;

@Repository
public class PermisoRepository  implements PermissionRepository {
    @Autowired
    private PermisoCrudRepository permisoCrudRepository;
    @Autowired
    private PermisoMapper mapper;

    @Override
    public List<DomainPermiso> getAll(){
       List<Permiso> permisos   = (List<Permiso>) permisoCrudRepository.findAll();
       return mapper.toDomainPermisos(permisos);
    }

    @Override
    public Optional<List<DomainPermiso>> getByDomainTipoPermiso(int idTipoPermiso) {
        List<Permiso> permisos   = permisoCrudRepository.findByIdTipoPermiso(idTipoPermiso);
    return Optional.of(mapper.toDomainPermisos(permisos));
    }

    @Override
    public Optional<List<DomainPermiso>> getScarseDomainPermiso(int cantidad) {
        Optional<List<Permiso>> permisos = permisoCrudRepository.findByCantidadPermisoLessThanAndEstado(cantidad,true);
        return permisos.map(prods -> mapper.toDomainPermisos(prods));
    }

    @Override
    public Optional<DomainPermiso> getDomainPermiso(int idPermiso) {
        return permisoCrudRepository.findById(idPermiso).map(permiso -> mapper.toDomainPermiso(permiso));
    }

    @Override
    public DomainPermiso save(DomainPermiso domainPermiso) {
        Permiso permiso = mapper.toPermiso(domainPermiso);
        return mapper.toDomainPermiso(permisoCrudRepository.save(permiso));
    }

    public void delete(int idPermiso){
        permisoCrudRepository.deleteById(idPermiso);
    }

}
