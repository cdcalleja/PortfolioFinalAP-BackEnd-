package tech.getarrays.ProyectoFinalAP.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getarrays.ProyectoFinalAP.security.entity.Rol;
import tech.getarrays.ProyectoFinalAP.security.enums.RolNombre;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
