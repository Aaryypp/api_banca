package com.banca.api_banca.services;

import com.banca.api_banca.models.Usuario;
import com.banca.api_banca.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service


public class UsuarioService {
    UsuarioRepository usuarioRepository;
    // Buscar usuario por ID
    public Usuario Auth(String username,String password) {
        return usuarioRepository.findByUsernameAndPassword(username,password);
    }
}
