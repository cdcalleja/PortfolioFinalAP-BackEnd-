package tech.getarrays.ProyectoFinalAP.service;
import tech.getarrays.ProyectoFinalAP.model.Persona;
import tech.getarrays.ProyectoFinalAP.exception.PersonaNotFoundException;
import tech.getarrays.ProyectoFinalAP.repo.Personarepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class PersonaService {

    private final Personarepo personaRepo;

    @Autowired
    public PersonaService(Personarepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona (Persona persona) {
        return personaRepo.save(persona);
    }

    public List<Persona> findAllPersonas () {
        return personaRepo.findAll();
    }

    public Persona updatePersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public Persona findPersonaById(Long id) {
        return personaRepo.findPersonaById(id)
                .orElseThrow(() -> new PersonaNotFoundException("Persona por id" + id + "no se encontró."));
    }

    public void deletePersona (Long id) {
        personaRepo.deleteById(id);
    }
}
