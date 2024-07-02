package pe.mpfn.project.persintence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BoletaPermisoPK implements Serializable {

    @Column(name="id_boleta")
    private Integer idBoleta;

    @Column(name="id_permiso")
    private Integer idPermiso;

    public Integer getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }
}
