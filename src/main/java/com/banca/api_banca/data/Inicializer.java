package com.banca.api_banca.data;

import com.banca.api_banca.models.Usuario;
import com.banca.api_banca.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Inicializer implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {
        // Obtener todos los usuarios actuales
        List<Usuario> usuarios = usuarioService.FindAll();

        // Para cada usuario, llamar a Registrar para hasear password y actualizar
        for (Usuario usuario : usuarios) {
            // Registrar de nuevo (lo guarda con password hasheada)
            usuarioService.Registrar(usuario);
        }
    }
}

