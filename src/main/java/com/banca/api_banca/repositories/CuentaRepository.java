package com.banca.api_banca.repositories;

import com.banca.api_banca.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

}
