package tech.getarrays.ProyectoFinalAP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.ProyectoFinalAP.exception.EducacionNotFoundException;
import tech.getarrays.ProyectoFinalAP.model.Educacion;
import tech.getarrays.ProyectoFinalAP.repo.Educacionrepo;

import java.util.List;
import java.util.UUID;

@Service
public class EducacionService {
    private final Educacionrepo educacionRepo;

    @Autowired
    public EducacionService(Educacionrepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion (Educacion educacion) {
        educacion.setEducacionCode(UUID.randomUUID().toString());
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public Educacion findEducacionById(Long id) {
        return educacionRepo.findEducacionById(id).
                orElseThrow(() -> new EducacionNotFoundException("Educación por id" + id + "no se encontró."));
    }

    public void deleteEducacion (Long id) {
        educacionRepo.deleteById(id);
    }
}
