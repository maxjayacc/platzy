package pe.mpfn.project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<DomainPermiso>> findAll()
    {
        return new ResponseEntity<>(permisoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DomainPermiso> findById(@PathVariable("id") int idPermision){
        return permisoService.findById(idPermision)
                .map(domainPermiso -> new ResponseEntity<>(domainPermiso, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_GATEWAY));
    }
    @GetMapping("/tipoPermiso/{idPermision}")
    public ResponseEntity<List<DomainPermiso>> getByDomainTipoPermiso(@PathVariable("idPermision") int idPermision){
        return permisoService.getByDomainTipoPermiso(idPermision)
                .map( domainPermisos -> new ResponseEntity<>(domainPermisos,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<DomainPermiso> save(@RequestBody  DomainPermiso permiso){
        return new ResponseEntity<>(permisoService.save(permiso), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity  deleteById(@PathVariable("id") int idPermision){
        if (permisoService.delete(idPermision)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
