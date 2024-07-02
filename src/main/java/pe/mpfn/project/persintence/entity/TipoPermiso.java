package pe.mpfn.project.persintence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

@Entity
@Table(name = "tipo_permiso")
public class TipoPermiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipopermiso")
    private Integer idTipoPermiso;

    private String descripcion;

    private boolean estado;

    @OneToMany(mappedBy = "tipoPermiso")
    private List<Permiso> permisos;

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }

    public Integer getIdTipoPermiso() {
        return idTipoPermiso;
    }

    public void setIdTipoPermiso(Integer idTipoPermiso) {
        this.idTipoPermiso = idTipoPermiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
