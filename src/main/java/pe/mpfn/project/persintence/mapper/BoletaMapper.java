package pe.mpfn.project.persintence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pe.mpfn.project.domain.DomainBoleta;
import pe.mpfn.project.domain.DomainBoletaPermiso;
import pe.mpfn.project.persintence.entity.Boleta;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BoletaPermisoMapper.class})
public interface BoletaMapper {

    @Mappings({
            @Mapping(source = "idBoleta", target = "id"),
            @Mapping(source = "idPersonal", target = "personalId"),
            @Mapping(source = "boletas", target = "DomainBoletas"),

    })
    DomainBoleta toDomainBoleta(Boleta boleta);
    List<DomainBoleta> toDomainBoleta(List<Boleta> boletas);

    @InheritInverseConfiguration
    @Mapping(target = "Personal", ignore=true)
    Boleta toBoleta(DomainBoleta domainBoleta);





}
