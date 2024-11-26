package com.example.backend_economicas.infraestructure.adapter.persistence;

import com.example.backend_economicas.domain.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataNoticiaRepository extends JpaRepository<Noticia, Long> {
}
