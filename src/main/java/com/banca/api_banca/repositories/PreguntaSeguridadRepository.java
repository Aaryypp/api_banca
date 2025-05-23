package com.banca.api_banca.repositories;
import com.banca.api_banca.models.PreguntaSeguridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaSeguridadRepository extends JpaRepository<PreguntaSeguridad, Long> {

}
