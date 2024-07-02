package pe.mpfn.project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.domain.service.DomainPermisoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/permiso")
public class DomainPermisoController
{
    @Autowired
    private DomainPermisoService permisoService;

    @GetMapping("/all")
    public List<DomainPermiso> findAll()
    {
        return permisoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DomainPermiso> findById(@PathVariable("id") int idPermision){
        return permisoService.findById(idPermision);
    }
    @GetMapping("/tipoPermiso/{idPermision}")
    public Optional<List<DomainPermiso>> getByDomainTipoPermiso(@PathVariable("idPermision") int idPermision){
        return permisoService.getByDomainTipoPermiso(idPermision);
    }

    @PostMapping("/save")
    public DomainPermiso save(@RequestBody  DomainPermiso permiso){
        return permisoService.save(permiso);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteById(@PathVariable("id") int idPermision){
        return permisoService.delete(idPermision);
    }


}
