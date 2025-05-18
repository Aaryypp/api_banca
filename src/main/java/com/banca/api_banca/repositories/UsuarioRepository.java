package com.banca.api_banca.repositories;
import com.banca.api_banca.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsernameAndPassword(String username, String password);

}
