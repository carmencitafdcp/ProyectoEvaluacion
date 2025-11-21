package com.salesianostriana.dam.proyecto_evaluacion.error;

public class GlobalExceptionHandler extends RuntimeException {
    public GlobalExceptionHandler(String message) {
        super("404 error");
    }
}
