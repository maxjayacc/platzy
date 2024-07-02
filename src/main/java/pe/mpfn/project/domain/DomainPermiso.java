package pe.mpfn.project.domain;

public class DomainPermiso {
    private Integer idPermision;
    private String  namePermision;
    private Integer typePermisionId;
    private double  permisionHours;
    private Integer permisionCant;
    private boolean active;

    public Integer getIdPermision() {
        return idPermision;
    }

    public void setIdPermision(Integer idPermision) {
        this.idPermision = idPermision;
    }

    public String getNamePermision() {
        return namePermision;
    }

    public void setNamePermision(String namePermision) {
        this.namePermision = namePermision;
    }

    public Integer getTypePermisionId() {
        return typePermisionId;
    }

    public void setTypePermisionId(Integer typePermisionId) {
        this.typePermisionId = typePermisionId;
    }


    public double getPermisionHours() {
        return permisionHours;
    }

    public void setPermisionHours(double permisionHours) {
        this.permisionHours = permisionHours;
    }

    public Integer getPermisionCant() {
        return permisionCant;
    }

    public void setPermisionCant(Integer permisionCant) {
        this.permisionCant = permisionCant;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
