package com.example.backend_economicas.domain.ports;

import com.example.backend_economicas.domain.model.Noticia;
import java.util.List;

public interface NoticiaRepository {
    List<Noticia> obtenerTodas();
    Noticia guardar(Noticia noticia);
}
