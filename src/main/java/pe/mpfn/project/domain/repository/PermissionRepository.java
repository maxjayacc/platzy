package pe.mpfn.project.domain.repository;

import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.domain.DomainTipoPermiso;
import pe.mpfn.project.persintence.entity.Permiso;

import java.util.List;
import java.util.Optional;

public interface PermissionRepository {
    List<DomainPermiso> getAll();
    Optional<List<DomainPermiso>> getByDomainTipoPermiso(int idTipoPermiso);
    Optional<List<DomainPermiso>> getScarseDomainPermiso(int quantity);
    Optional<DomainPermiso> getDomainPermiso(int idPermiso);
    DomainPermiso save(DomainPermiso domainPermiso);
    void delete(int idPermiso);
}
