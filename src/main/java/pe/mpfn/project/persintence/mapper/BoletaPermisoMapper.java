package pe.mpfn.project.persintence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pe.mpfn.project.domain.DomainBoleta;
import pe.mpfn.project.domain.DomainBoletaPermiso;
import pe.mpfn.project.persintence.entity.BoletaPermiso;

@Mapper(componentModel = "spring", uses={PermisoMapper.class} )
public interface BoletaPermisoMapper {
    @Mappings({
            @Mapping(source="id.idPermiso", target = "idPermission"),
            @Mapping(source="cantidad", target = "quantity"),
            @Mapping(source="estado", target = "active")

    })
    DomainBoletaPermiso toDomainBoletaPermiso(BoletaPermiso boletaPermiso);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "boleta", ignore=true),
            @Mapping(target = "permiso", ignore=true),
            @Mapping(target = "id.id", ignore=true),
    })
    BoletaPermiso toBoletaPermiso(DomainBoletaPermiso permiso);





}
