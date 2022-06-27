package tech.getarrays.ProyectoFinalAP.security.entity;

import com.sun.istack.NotNull;
import tech.getarrays.ProyectoFinalAP.security.enums.RolNombre;

import javax.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Rol() {
    }
}
