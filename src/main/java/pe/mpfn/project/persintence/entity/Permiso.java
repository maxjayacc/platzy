package pe.mpfn.project.persintence.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "permiso")
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_permiso")
    private Integer idPermiso;

    @Column(name="nombre")
    private String nombre;

    @Column(name = "id_tipopermiso")
    private Integer idTipoPermiso;

    @Column(name="codigo_barras")
    private String codigoBarra;

    @Column(name="horas_permiso")
    private double horasPermiso;

    @Column(name="cantidad_permiso")
    private Integer cantidadPermiso;

    @Column(name="estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_tipopermiso", insertable = false, updatable = false)
    private TipoPermiso tipoPermiso;

    @OneToMany
    @JoinColumn(name="permiso", insertable = false, updatable = false  )
    private List<BoletaPermiso> boletaPermisos;


    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTipoPermiso() {
        return idTipoPermiso;
    }

    public void setIdTipoPermiso(Integer idTipoPermiso) {
        this.idTipoPermiso = idTipoPermiso;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getHorasPermiso() {
        return horasPermiso;
    }

    public void setHorasPermiso(double horasPermiso) {
        this.horasPermiso = horasPermiso;
    }

    public Integer getCantidadPermiso() {
        return cantidadPermiso;
    }

    public void setCantidadPermiso(Integer cantidadPermiso) {
        this.cantidadPermiso = cantidadPermiso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public List<BoletaPermiso> getBoletaPermisos() {
        return boletaPermisos;
    }

    public void setBoletaPermisos(List<BoletaPermiso> boletaPermisos) {
        this.boletaPermisos = boletaPermisos;
    }
}
