package com.banca.api_banca.services;

import com.banca.api_banca.models.VerificacionUsuario;
import com.banca.api_banca.repositories.VerificacionUsuarioRepository;

public class VerificacionUsuarioServices {

    VerificacionUsuarioRepository repository;
    public  VerificacionUsuario getverificacion(Long idUsuario, Long idPregunta, String respuesta,Long idicono) {
        return repository.findByUsuario_IdUsuarioAndPregunta_IdPreguntaAndRespuestaAndIcono_IdIcono(
                idUsuario, idPregunta, respuesta,idicono);

    }
}
