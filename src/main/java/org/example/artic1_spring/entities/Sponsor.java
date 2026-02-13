package org.example.artic1_spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;
    Boolean archived;
    LocalDate dateCreation;
    LocalDate dateDerniereModification;


    @OneToMany(mappedBy = "sponsor")
    private List<Contrat> contrats;
}


