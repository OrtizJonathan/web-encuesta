package com.IT.pruebaTecnica.service.impl;

import com.IT.pruebaTecnica.entities.EstiloMusica;
import com.IT.pruebaTecnica.repository.EstiloMusicaRepository;
import com.IT.pruebaTecnica.service.EstiloMusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstiloMusicaServiceImpl implements EstiloMusicaService {

    @Autowired
    private EstiloMusicaRepository estiloMusicaRepository;

    @Override
    public List<EstiloMusica> obtenerTodosEstilos() {
        return estiloMusicaRepository.findAll();
    }
}
