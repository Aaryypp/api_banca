package com.banca.api_banca.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificacionUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVerificacion;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_pregunta")
    private PreguntaSeguridad pregunta;

    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "id_icono")
    private IconoSeguridad icono;
}
