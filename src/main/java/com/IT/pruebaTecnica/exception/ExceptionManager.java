package com.IT.pruebaTecnica.exception;

import com.IT.pruebaTecnica.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionManager {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorDto> manejoException(Exception ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(
                ErrorDto.builder().codigo("P-01").mensaje("Ocurrió un error no controlado").build(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({ValidacionException.class})
    public ResponseEntity<ErrorDto> manejoException(ValidacionException ex) {
        return new ResponseEntity<>(
                ErrorDto.builder().codigo(ex.getCodigo()).mensaje(ex.getMensaje()).build(),
                HttpStatus.CONFLICT);
    }
}
