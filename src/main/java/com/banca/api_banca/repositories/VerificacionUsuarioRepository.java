package com.banca.api_banca.repositories;
import com.banca.api_banca.models.VerificacionUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificacionUsuarioRepository extends JpaRepository<VerificacionUsuario, Long> {

 VerificacionUsuario findByUsuario_IdUsuarioAndPregunta_IdPreguntaAndRespuestaAndIcono_IdIcono(Long idusuario,Long idPregunta, String respuesta, Long idicono);

}
