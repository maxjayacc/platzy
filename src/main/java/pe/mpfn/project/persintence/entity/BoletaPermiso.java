package pe.mpfn.project.persintence.entity;


import javax.persistence.*;

@Entity
@Table(name = "boleta_permiso")
public class BoletaPermiso {

    @EmbeddedId
    private BoletaPermisoPK id;

    private Integer cantidad;

    private double total;

    private boolean estado;

    @ManyToOne
    @JoinColumn(name="id_boleta", insertable = false,updatable = false)
    private Boleta boleta;

    @ManyToOne
    @JoinColumn(name = "id_permiso", insertable = false, updatable = false)
    private Permiso permiso;

    public BoletaPermisoPK getId() {
        return id;
    }

    public void setId(BoletaPermisoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
