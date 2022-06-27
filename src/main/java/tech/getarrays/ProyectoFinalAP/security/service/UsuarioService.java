package tech.getarrays.ProyectoFinalAP.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.getarrays.ProyectoFinalAP.security.entity.Usuario;
import tech.getarrays.ProyectoFinalAP.security.repository.UsuarioRepository;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getbyNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario (String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail (String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public void save (Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
