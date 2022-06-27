package tech.getarrays.ProyectoFinalAP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getarrays.ProyectoFinalAP.model.Persona;

import java.util.Optional;
@Repository
public interface Personarepo extends JpaRepository <Persona, Long> {

    Optional<Persona> findPersonaById(Long id);
}
