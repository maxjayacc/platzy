package pe.mpfn.project.domain;

public class DomainTipoPermiso {
    private Integer typePermissionId;
    private String description;
    public boolean active;

    public Integer getTypePermissionId() {
        return typePermissionId;
    }

    public void setTypePermissionId(Integer typePermissionId) {
        this.typePermissionId = typePermissionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
