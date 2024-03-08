package com.IT.pruebaTecnica.service.impl;

import com.IT.pruebaTecnica.entities.EstiloMusica;
import com.IT.pruebaTecnica.repository.EstiloMusicaRepository;
import com.IT.pruebaTecnica.util.GeneratorDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EstiloMusicaServiceImplTest {

    @Mock
    private EstiloMusicaRepository estiloMusicaRepository;
    @InjectMocks
    private EstiloMusicaServiceImpl estiloMusicaServiceImpl;
    AutoCloseable openMocks;

    @BeforeEach
    void setup(){
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @Test
    void obtenerTodosEstilos() {
        try {
            Mockito.when(estiloMusicaRepository.findAll()).thenReturn(GeneratorDto.listadoEstiloMusica());
            List<EstiloMusica> list = Assertions.assertDoesNotThrow(()->estiloMusicaServiceImpl.obtenerTodosEstilos());
            Assertions.assertNotNull(list);
            Assertions.assertFalse(list.isEmpty());
        } catch (Exception ex){
            ex.printStackTrace();
            Assertions.fail();
        }
    }
}