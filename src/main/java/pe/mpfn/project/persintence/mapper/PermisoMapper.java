package pe.mpfn.project.persintence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.persintence.entity.Permiso;
import java.util.List;


@Mapper(componentModel = "spring")
public interface PermisoMapper {
    @Mappings({
            @Mapping(source="idPermiso",target="idPermision"),
            @Mapping(source="nombre",target="namePermision"),
            @Mapping(source="idTipoPermiso",target="typePermisionId"),

            @Mapping(source="horasPermiso",target="permisionHours"),
            @Mapping(source="cantidadPermiso",target="permisionCant"),
            @Mapping(source="estado",target="active"),
    })
    DomainPermiso toDomainPermiso(Permiso permiso);
    List<DomainPermiso> toDomainPermisos(List<Permiso> permisos);

    @InheritInverseConfiguration()
    @Mapping(target = "codigoBarra", ignore = true)
    Permiso toPermiso(DomainPermiso domainPermiso);

}
