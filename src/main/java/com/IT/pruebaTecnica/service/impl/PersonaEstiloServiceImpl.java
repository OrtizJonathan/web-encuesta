package com.IT.pruebaTecnica.service.impl;

import com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto;
import com.IT.pruebaTecnica.entities.PersonaEstilo;
import com.IT.pruebaTecnica.exception.ValidacionException;
import com.IT.pruebaTecnica.repository.PersonaEstiloRepository;
import com.IT.pruebaTecnica.service.PersonaEstiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaEstiloServiceImpl implements PersonaEstiloService {

    @Autowired
    private PersonaEstiloRepository personaEstiloRepository;

    @Override
    public PersonaEstilo guardar(PersonaEstilo personaEstilo) {
        if (validacionMail(personaEstilo.getEmail())){
            throw new ValidacionException("P-02", "Email ya se encuentra registrado");
        }
        return personaEstiloRepository.save(personaEstilo);
    }

    @Override
    public List<EstiloMusicaContadorDto> obtenerContadores() {
        return personaEstiloRepository.obtenerContadorMusical();
    }

    private Boolean validacionMail(String mail){
        return personaEstiloRepository.existsByEmail(mail);
    }
}
