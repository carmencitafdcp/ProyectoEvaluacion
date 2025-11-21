package com.salesianostriana.dam.proyecto_evaluacion.controller;


import com.salesianostriana.dam.proyecto_evaluacion.service.rutasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class rutasController {
    private final rutasService rutasService;

    //@GetMapping
    public List<rutasService> routes;

}
