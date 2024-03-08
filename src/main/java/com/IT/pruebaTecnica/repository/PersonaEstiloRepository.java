package com.IT.pruebaTecnica.repository;

import com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto;
import com.IT.pruebaTecnica.entities.PersonaEstilo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaEstiloRepository extends JpaRepository<PersonaEstilo, Long> {

    boolean existsByEmail(String email);
    //List<PersonaEstilo> findByMail(String email);

    @Query("select new com.IT.pruebaTecnica.dto.EstiloMusicaContadorDto(e.nombre, count(p.email)) " +
            "from PersonaEstilo p right join p.estiloMusica e " +
            "GROUP BY e.nombre, p.estiloMusica")
    public List<EstiloMusicaContadorDto> obtenerContadorMusical();
}
