package pe.mpfn.project.domain;

import java.util.List;

public class DomainBoleta {
    private int id;
    private String personalId;
    private String fecha;
    private String solicitud;
    private String comentario;
    private boolean estado; ;
    private List<DomainBoletaPermiso> DomainBoletaPermisos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonalId() {
        return personalId;
    }
    public void setPersonalId(String personalId) {
        this.personalId = personalId;
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

    public List<DomainBoletaPermiso> getDomainBoletaPermisos() {
        return DomainBoletaPermisos;
    }

    public void setBoletaPermiso(List<DomainBoletaPermiso> DomainBoletaPermisos) {
        this.DomainBoletaPermisos = DomainBoletaPermisos;
    }
}
