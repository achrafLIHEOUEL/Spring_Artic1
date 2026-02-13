package org.example.artic1_spring.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String libelle;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @OneToMany(mappedBy = "equipe")
    private List<Contrat> contrats;
    @OneToMany(mappedBy = "equipe")
    private List<Pilote> pilotes;
}
