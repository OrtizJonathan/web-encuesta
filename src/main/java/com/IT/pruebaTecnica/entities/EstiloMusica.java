package com.IT.pruebaTecnica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ESTILO_MUSICA")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstiloMusica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

}
