package com.example.backend_economicas.presentation.controller;

import com.example.backend_economicas.application.service.StrapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/noticias")
public class NoticiasController {
    private final StrapiService strapiService;

    public NoticiasController(StrapiService strapiService) {
        this.strapiService = strapiService;
    }

    @GetMapping
    public String obtenerNoticias() {
        return strapiService.obtenerNoticias();
    }

    @PostMapping
    public String crearNoticia(@RequestBody Map<String, String> payload) {
        String titulo = payload.get("titulo");
        String contenido = payload.get("contenido");
        return strapiService.crearNoticia(titulo, contenido);
    }
}
