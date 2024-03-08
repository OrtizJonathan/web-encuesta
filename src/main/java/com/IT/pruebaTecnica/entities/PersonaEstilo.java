package com.IT.pruebaTecnica.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PERSONA_ESTILO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaEstilo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "idEstiloMusica")
    @ManyToOne
    private EstiloMusica estiloMusica;

    @NonNull
    private String email;

}
