package pe.mpfn.project.persintence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pe.mpfn.project.domain.DomainTipoPermiso;
import pe.mpfn.project.persintence.entity.TipoPermiso;;

@Mapper(componentModel = "spring")
public interface TipoPermisoMapper {
    @Mappings({
            @Mapping(source = "idTipoPermiso", target = "typePermissionId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "active")
    })
    DomainTipoPermiso toDomainTipoPermiso(TipoPermiso tipoPermiso);

    @InheritInverseConfiguration
    @Mapping(target = "permisos", ignore = true)
    TipoPermiso toTipoPermiso(DomainTipoPermiso domainTipoPermiso);

}

