package pe.mpfn.project.domain.repository;

import pe.mpfn.project.domain.DomainBoleta;
import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.persintence.entity.Boleta;

import java.util.List;
import java.util.Optional;

public interface TicketRepository {
    List<DomainBoleta> findAll();
    Optional<List<DomainBoleta>> findByPersonal(String personalId);
    DomainBoleta save(DomainBoleta domainBoleta);
}
