package com.banca.api_banca.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IconoSeguridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIcono;

    private String nombreIcono;

    private String idImg;

}