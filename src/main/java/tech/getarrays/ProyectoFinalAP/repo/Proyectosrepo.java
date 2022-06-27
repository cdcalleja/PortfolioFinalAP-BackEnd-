package tech.getarrays.ProyectoFinalAP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.ProyectoFinalAP.model.Proyectos;

import java.util.Optional;

public interface Proyectosrepo extends JpaRepository<Proyectos, Long> {

    Optional<Proyectos> findProyectosById(Long id);
}
