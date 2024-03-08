package com.IT.pruebaTecnica.service.impl;

import com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto;
import com.IT.pruebaTecnica.entities.EstiloMusica;
import com.IT.pruebaTecnica.entities.PersonaEstilo;
import com.IT.pruebaTecnica.exception.ValidacionException;
import com.IT.pruebaTecnica.repository.PersonaEstiloRepository;
import com.IT.pruebaTecnica.util.GeneratorDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonaEstiloServiceImplTest {

    @Mock
    private PersonaEstiloRepository personaEstiloRepository;
    @InjectMocks
    private PersonaEstiloServiceImpl personaEstiloServiceImpl;
    AutoCloseable openMocks;

    @BeforeEach
    void setup(){
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @Test
    void mailExistente() {
        try {
            Mockito.when(personaEstiloRepository.existsByEmail(Mockito.anyString())).thenReturn(true);
            ValidacionException ex = Assertions.assertThrows(ValidacionException.class,
                    ()->personaEstiloServiceImpl.guardar(GeneratorDto.generarPersonaEstilo()));
            Assertions.assertEquals("P-02", ex.getCodigo());
        } catch (Exception ex){
            ex.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    void personaEncuestaGuardado() {
        try {
            PersonaEstilo personaEstilo = GeneratorDto.generarPersonaEstilo();
            personaEstilo.setId(1L);
            Mockito.when(personaEstiloRepository.existsByEmail(Mockito.anyString())).thenReturn(false);
            Mockito.when(personaEstiloRepository.save(Mockito.any())).thenReturn(personaEstilo);
            PersonaEstilo votacionGuardada = Assertions.assertDoesNotThrow(()->personaEstiloServiceImpl.guardar(GeneratorDto.generarPersonaEstilo()));
            Assertions.assertEquals(1L, votacionGuardada.getId());
        } catch (Exception ex){
            ex.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    void obtenerContadoresMusicales() {
        try {
            Mockito.when(personaEstiloRepository.obtenerContadorMusical()).thenReturn(GeneratorDto.listadoEstiloContador());
            List<EstiloMusicaContadorDto> list = Assertions.assertDoesNotThrow(()->personaEstiloServiceImpl.obtenerContadores());
            Assertions.assertNotNull(list);
            Assertions.assertFalse(list.isEmpty());
        } catch (Exception ex){
            ex.printStackTrace();
            Assertions.fail();
        }
    }
}

//