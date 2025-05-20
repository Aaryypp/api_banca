package com.banca.api_banca.controllers;

import com.banca.api_banca.models.IconoSeguridad;
import com.banca.api_banca.services.IconoSeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"${settings.cors_origin}"})
@RestController
@RequestMapping("/api")
public class IconoSeguridadController {

    @Autowired
    private IconoSeguridadService iconoSeguridadService;

    @GetMapping("/iconos")
    public ResponseEntity<List<IconoSeguridad>> getAllIconos() {
        List<IconoSeguridad> iconos = iconoSeguridadService.getAll();
        return ResponseEntity.ok(iconos);
    }
}
