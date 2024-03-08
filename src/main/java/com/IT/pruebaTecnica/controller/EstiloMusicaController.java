package com.IT.pruebaTecnica.controller;

import com.IT.pruebaTecnica.entities.EstiloMusica;
import com.IT.pruebaTecnica.service.EstiloMusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estilo")
public class EstiloMusicaController {

    @Autowired
    private EstiloMusicaService estiloMusicaService;

    @GetMapping
    private ResponseEntity<List<EstiloMusica>> obtenerTodos(){
        return ResponseEntity.ok(estiloMusicaService.obtenerTodosEstilos());
    }

}
