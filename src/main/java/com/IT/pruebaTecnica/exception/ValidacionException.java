package com.IT.pruebaTecnica.exception;

import lombok.*;

@AllArgsConstructor
@Getter
public class ValidacionException extends RuntimeException {

    private String codigo;
    private String mensaje;
}
