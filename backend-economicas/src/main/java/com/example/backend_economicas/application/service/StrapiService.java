package com.example.backend_economicas.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@Service
public class StrapiService {
    private final RestTemplate restTemplate;
    private final String STRAPI_BASE_URL = "http://localhost:1337/api/";

    public StrapiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String obtenerNoticias() {
        String url = STRAPI_BASE_URL + "noticias";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }

    public String crearNoticia(String titulo, String contenido) {
        String url = STRAPI_BASE_URL + "noticias";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        String requestJson = "{ \"data\": { \"titulo\": \"" + titulo + "\", \"Contenido\": \"" + contenido + "\" } }";
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        return response.getBody();
    }
}
