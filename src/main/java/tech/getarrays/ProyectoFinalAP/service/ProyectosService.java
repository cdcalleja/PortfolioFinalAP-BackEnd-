package tech.getarrays.ProyectoFinalAP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.ProyectoFinalAP.exception.ProyectosNotFoundException;
import tech.getarrays.ProyectoFinalAP.model.Educacion;
import tech.getarrays.ProyectoFinalAP.model.Proyectos;
import tech.getarrays.ProyectoFinalAP.model.Skills;
import tech.getarrays.ProyectoFinalAP.repo.Proyectosrepo;

import java.util.List;
import java.util.UUID;

@Service
public class ProyectosService {
    private final Proyectosrepo proyectosRepo;

    @Autowired
    public ProyectosService(Proyectosrepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyectos addproyectos (Proyectos proyectos) {
        proyectos.setProyectosCode(UUID.randomUUID().toString());
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> findAllProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos updateProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public Proyectos findProyectosById(Long id) {
        return proyectosRepo.findProyectosById(id)
                .orElseThrow(() -> new ProyectosNotFoundException("Proyecto por id" + id + "no se encontró."));
    }

    public void deleteProyectos (Long id) {
        proyectosRepo.deleteById(id);
    }
}
