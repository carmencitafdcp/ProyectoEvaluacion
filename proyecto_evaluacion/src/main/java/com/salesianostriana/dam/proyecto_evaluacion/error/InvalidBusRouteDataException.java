package com.salesianostriana.dam.proyecto_evaluacion.error;

public class InvalidBusRouteDataException extends RuntimeException {
    public InvalidBusRouteDataException(String message) {
        super("Error. No existen estos datos de ruta.");
    }
}
