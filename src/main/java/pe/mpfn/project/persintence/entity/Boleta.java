package pe.mpfn.project.persintence.entity;

import org.springframework.data.jpa.repository.query.InvalidJpaQueryMethodException;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boleta")
public class Boleta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_boleta")
    private int idBoleta;

    @Column(name="id_personal")
    private int idPersonal;

    private String fecha;

    private String solicitud;

    private String comentario;

    private boolean estado;

    @ManyToOne
    @JoinColumn(name="id", insertable = false, updatable = false)
    private Personal personal;

    @OneToMany(mappedBy = "boleta")
    private List<BoletaPermiso> boletaPermisos;

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getId_personal() {
        return idPersonal;
    }

    public void setId_personal(int id_personal) {
        this.idPersonal = id_personal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
