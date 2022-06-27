package tech.getarrays.ProyectoFinalAP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.ProyectoFinalAP.exception.SkillsNotFoundException;
import tech.getarrays.ProyectoFinalAP.model.Educacion;
import tech.getarrays.ProyectoFinalAP.model.Experiencia;
import tech.getarrays.ProyectoFinalAP.model.Skills;
import tech.getarrays.ProyectoFinalAP.repo.Skillsrepo;

import java.util.List;
import java.util.UUID;

@Service
public class SkillsService {
    private final Skillsrepo skillsRepo;

    @Autowired
    public SkillsService(Skillsrepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills (Skills skills) {
    skills.setSkillsCode(UUID.randomUUID().toString());
    return skillsRepo.save(skills);
    }

    public List<Skills> findAllSkills() {
        return skillsRepo.findAll();
    }

    public Skills updateSkills(Skills skills) {
        return skillsRepo.save(skills);
    }

    public Skills findSkillsById(Long id) {
        return skillsRepo.findSkillsById(id)
                .orElseThrow(() -> new SkillsNotFoundException("Skill por id" + id + "no se encontró."));
    }

    public void deleteSkills (Long id) {
        skillsRepo.deleteById(id);
    }
}
