package com.IT.pruebaTecnica.repository;

import com.IT.pruebaTecnica.entities.EstiloMusica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstiloMusicaRepository extends JpaRepository<EstiloMusica, Long> {
}
