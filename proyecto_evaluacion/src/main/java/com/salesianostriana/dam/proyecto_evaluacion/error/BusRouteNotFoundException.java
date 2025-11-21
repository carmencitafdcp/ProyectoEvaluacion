package com.salesianostriana.dam.proyecto_evaluacion.error;

public class BusRouteNotFoundException extends RuntimeException {
    public BusRouteNotFoundException(String message) {
        super("Lo siento la ruta no ha sido encontrada.");
    }
}
