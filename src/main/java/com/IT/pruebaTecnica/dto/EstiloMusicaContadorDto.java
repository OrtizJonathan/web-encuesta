package com.IT.pruebaTecnica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstiloMusicaContadorDto {

    private String nombre;
    private Long cantidad;
}
