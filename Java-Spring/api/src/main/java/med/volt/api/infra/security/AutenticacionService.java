package med.volt.api.infra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import med.volt.api.domain.usuarios.UsuarioRepository;

@Service
public class AutenticacionService implements UserDetailsService {

    @Autowired //no es recomendado
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {//de dondo carga el usuario
        return usuarioRepository.findByLogin(username);
    }
}
