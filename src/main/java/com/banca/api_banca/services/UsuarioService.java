package com.banca.api_banca.services;

import com.banca.api_banca.models.Usuario;
import com.banca.api_banca.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Buscar usuario por ID
    public Usuario Auth(String username, String password) {
        Usuario user = usuarioRepository.findByUsername(username);

        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user; // autenticación exitosa
        }

        return null; // autenticación fallida
    }

    public Usuario Registrar(Usuario user) {
        String passwordHasheada = passwordEncoder.encode(user.getPassword());
        user.setPassword(passwordHasheada);
        return usuarioRepository.save(user);
    }

    public List<Usuario> FindAll(){
        return usuarioRepository.findAll();
    }
}
