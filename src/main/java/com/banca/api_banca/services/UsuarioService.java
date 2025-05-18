package com.banca.api_banca.services;

import com.banca.api_banca.models.Usuario;
import com.banca.api_banca.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    // Buscar usuario por ID
    public Usuario Auth(String username,String password) {
        return usuarioRepository.findByUsernameAndPassword(username,password);
    }
}
