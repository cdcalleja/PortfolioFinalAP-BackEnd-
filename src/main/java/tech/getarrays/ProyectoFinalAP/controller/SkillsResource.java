package tech.getarrays.ProyectoFinalAP.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.ProyectoFinalAP.model.Skills;
import tech.getarrays.ProyectoFinalAP.service.SkillsService;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsResource {
    private final SkillsService skillsService;

    public SkillsResource(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> getAllSkills() {
        List<Skills> skills = skillsService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skills> getskilssById(@PathVariable("id") Long id) {
        Skills skills = skillsService.findSkillsById(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skills> addSkills (@RequestBody Skills skills) {
        Skills newSkill = skillsService.addSkills(skills);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Skills> updateSkill(@RequestBody Skills skills) {
        Skills updateSkill = skillsService.updateSkills(skills);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id) {
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}



