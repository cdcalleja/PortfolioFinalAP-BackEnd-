package tech.getarrays.ProyectoFinalAP.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.getarrays.ProyectoFinalAP.security.entity.Rol;
import tech.getarrays.ProyectoFinalAP.security.enums.RolNombre;
import tech.getarrays.ProyectoFinalAP.security.repository.RolRepository;

import java.util.Optional;


@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save (Rol rol){
        rolRepository.save(rol);
    }
}
