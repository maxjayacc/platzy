package pe.mpfn.project.domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.domain.repository.PermissionRepository;
import pe.mpfn.project.persintence.PermisoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DomainPermisoService {
    @Autowired
    private PermissionRepository permissionRepository;

    public List<DomainPermiso> findAll() {
        return permissionRepository.getAll();
    }

    public Optional<DomainPermiso> findById(int idPermision) {
        return permissionRepository.getDomainPermiso(idPermision);
    }
    public Optional<List<DomainPermiso>> getByDomainTipoPermiso (int idTipoPermiso) {
        return permissionRepository.getByDomainTipoPermiso(idTipoPermiso);
    }

    public DomainPermiso save(DomainPermiso domainPermiso) {
        return permissionRepository.save(domainPermiso);
    }


    public boolean delete(int idPermision) {
        return findById(idPermision).map(domainPermiso -> {
            permissionRepository.delete(idPermision);
        return true;
        }).orElse(false);

    }
/*
    public boolean delete (int idPermision) {
        if(findById(idPermision).isPresent()){
            permissionRepository.delete(idPermision);
            return true;
        }else{
            return false;
        }
    }*/

}

