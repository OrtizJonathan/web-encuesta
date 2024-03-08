package com.IT.pruebaTecnica.controller;

import com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto;
import com.IT.pruebaTecnica.entities.EstiloMusica;
import com.IT.pruebaTecnica.entities.PersonaEstilo;
import com.IT.pruebaTecnica.service.PersonaEstiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaEstiloController {

    @Autowired
    private PersonaEstiloService personaEstiloService;

    @PostMapping
    private ResponseEntity<String> guardarPersonaEstilo(@RequestBody PersonaEstilo personaEstilo){
        PersonaEstilo personaGuardar = personaEstiloService.guardar(personaEstilo);
        return ResponseEntity.ok("Encuesta realizada");
    }

    @GetMapping("/contadores")
    private ResponseEntity<List<EstiloMusicaContadorDto>> obtenerTodos(){
        return ResponseEntity.ok(personaEstiloService.obtenerContadores());
    }

}
