package tech.getarrays.ProyectoFinalAP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.ProyectoFinalAP.model.Educacion;

import java.util.Optional;

public interface Educacionrepo extends JpaRepository <Educacion, Long> {

    Optional<Educacion> findEducacionById(Long id);
}
