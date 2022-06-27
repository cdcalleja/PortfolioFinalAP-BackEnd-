/*package tech.getarrays.ProyectoFinalAP.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.getarrays.ProyectoFinalAP.security.entity.Rol;
import tech.getarrays.ProyectoFinalAP.security.enums.RolNombre;
import tech.getarrays.ProyectoFinalAP.security.service.RolService;

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;
    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
}*/

