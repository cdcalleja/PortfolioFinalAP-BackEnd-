package tech.getarrays.ProyectoFinalAP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.ProyectoFinalAP.model.Experiencia;

import java.util.Optional;

public interface Experienciarepo extends JpaRepository <Experiencia, Long> {


    Optional<Experiencia> findExperienciaById(Long id);
}
