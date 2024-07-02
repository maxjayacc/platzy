package pe.mpfn.project.persintence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="personal")
public class Personal {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre ;
    private String apellidos ;
    private String direccion ;
    @Column(name="correo_electronico")
    private String email ;

    @OneToMany(mappedBy = "personal")
    private List<Boleta> boletas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
