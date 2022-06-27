package tech.getarrays.ProyectoFinalAP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.ProyectoFinalAP.model.Skills;

import java.util.Optional;

public interface Skillsrepo extends JpaRepository <Skills, Long> {

    Optional<Skills> findSkillsById(Long id);
}
