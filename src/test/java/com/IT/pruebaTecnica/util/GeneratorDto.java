package com.IT.pruebaTecnica.util;

import com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto;
import com.IT.pruebaTecnica.entities.EstiloMusica;
import com.IT.pruebaTecnica.entities.PersonaEstilo;

import java.util.Arrays;
import java.util.List;

public class GeneratorDto {

    public static PersonaEstilo generarPersonaEstilo(){
        return PersonaEstilo.builder()
                .email("juan@gmail.com")
                .estiloMusica(generarEstiloMusica())
                .build();
    }

    public static EstiloMusica generarEstiloMusica(){
        return EstiloMusica.builder().nombre("Rock").build();
    }

    public static List<EstiloMusica> listadoEstiloMusica(){
        return Arrays.asList(generarEstiloMusica());
    }

    public static EstiloMusicaContadorDto generarEstiloContador(){
        return EstiloMusicaContadorDto.builder().nombre("Rock").cantidad(2L).build();
    }

    public static List<EstiloMusicaContadorDto> listadoEstiloContador(){
        return Arrays.asList(generarEstiloContador());
    }

}
