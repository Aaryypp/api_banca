package com.banca.api_banca.repositories;
import com.banca.api_banca.models.IconoSeguridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconoSeguridadRepository extends JpaRepository<IconoSeguridad, Long> {


}
