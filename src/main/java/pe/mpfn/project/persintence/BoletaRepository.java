package pe.mpfn.project.persintence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.mpfn.project.domain.DomainBoleta;
import pe.mpfn.project.domain.DomainPermiso;
import pe.mpfn.project.domain.repository.TicketRepository;
import pe.mpfn.project.persintence.crud.BoletaCrudRepository;
import pe.mpfn.project.persintence.entity.Boleta;
import pe.mpfn.project.persintence.entity.Permiso;
import pe.mpfn.project.persintence.mapper.BoletaMapper;

import java.util.List;
import java.util.Optional;

@Repository
public class BoletaRepository implements TicketRepository {

    @Autowired
    private BoletaCrudRepository boletaCrudRepository;

    @Autowired
    private BoletaMapper mapper;

    @Override
    public List<DomainBoleta> findAll() {
        return  mapper.toDomainBoleta((List<Boleta>) boletaCrudRepository.findAll());
    }

    @Override
    public Optional<List<DomainBoleta>> findByPersonal(String personalId) {
        return boletaCrudRepository.findByPersonal(personalId)
                .map(boletas -> mapper.toDomainBoleta(boletas));
    }

    @Override
    public DomainBoleta save(DomainBoleta domainBoleta) {
        Boleta  boleta = mapper.toBoleta(domainBoleta);
        boleta
    }
}
