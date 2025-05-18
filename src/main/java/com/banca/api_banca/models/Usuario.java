package com.banca.api_banca.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombreCompleto;

    @Column(unique = true)
    private String username;

    private String password;

    private String email;

    private LocalDateTime fechaRegistro;

    private Boolean estado;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Cuenta> cuentas;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private VerificacionUsuario verificacion;
}
