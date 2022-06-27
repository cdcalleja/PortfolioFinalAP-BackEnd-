package tech.getarrays.ProyectoFinalAP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.ProyectoFinalAP.exception.ExperienciaNotFoundException;
import tech.getarrays.ProyectoFinalAP.model.Experiencia;
import tech.getarrays.ProyectoFinalAP.repo.Experienciarepo;

import java.util.List;
import java.util.UUID;

@Service
public class ExperienciaService {
    private final Experienciarepo experienciaRepo;

    @Autowired
    public ExperienciaService(Experienciarepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia (Experiencia experiencia) {
        experiencia.setExperienciaCode(UUID.randomUUID().toString());
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> findAllExperiencias() {
        return experienciaRepo.findAll();
    }

    public Experiencia updateExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public Experiencia findExperienciaById(Long id) {
        return experienciaRepo.findExperienciaById(id)
                .orElseThrow(() -> new ExperienciaNotFoundException("Experiencia por id" + id + "no se encontró."));
    }

    public void deleteExperiencia (Long id) {
        experienciaRepo.deleteById(id);
    }
}
