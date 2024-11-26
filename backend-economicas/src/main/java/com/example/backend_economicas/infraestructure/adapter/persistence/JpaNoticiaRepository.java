package com.example.backend_economicas.infraestructure.adapter.persistence;

import com.example.backend_economicas.domain.model.Noticia;
import com.example.backend_economicas.domain.ports.NoticiaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaNoticiaRepository implements NoticiaRepository {
    private final SpringDataNoticiaRepository repository;

    public JpaNoticiaRepository(SpringDataNoticiaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Noticia> obtenerTodas() {
        return repository.findAll();
    }

    @Override
    public Noticia guardar(Noticia noticia) {
        return repository.save(noticia);
    }
}
