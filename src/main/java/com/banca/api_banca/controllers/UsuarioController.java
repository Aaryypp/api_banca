package com.banca.api_banca.controllers;
import com.banca.api_banca.models.Usuario;
import com.banca.api_banca.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsuarioController {
    @Autowired
    private  UsuarioService usuarioService;
    @GetMapping("/login")
    public ResponseEntity<Usuario> login(
            @RequestParam String username,
            @RequestParam String password
    ) {
        Usuario usuario = usuarioService.Auth(username, password);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}