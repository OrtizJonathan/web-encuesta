package com.IT.pruebaTecnica.service;

import com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto;
import com.IT.pruebaTecnica.entities.PersonaEstilo;

import java.util.List;

public interface PersonaEstiloService {

    PersonaEstilo guardar(PersonaEstilo personaEstilo);
    List<EstiloMusicaContadorDto> obtenerContadores();
}
