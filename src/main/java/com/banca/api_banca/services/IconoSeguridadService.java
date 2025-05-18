package com.banca.api_banca.services;

import com.banca.api_banca.models.IconoSeguridad;
import com.banca.api_banca.repositories.IconoSeguridadRepository;

import java.util.List;

public class IconoSeguridadService {

    IconoSeguridadRepository repository;
    public List<IconoSeguridad> getAll(){
        return repository.findAll();
    }

}
