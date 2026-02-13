package org.example.artic1_spring.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String libelleC;
    private Integer annee;

    @ManyToOne
    @JoinColumn(name = "detail_championnat_id", nullable = false)
    private DetailChampionnat detailChampionnat;

    @OneToMany(mappedBy = "championnat")
    private List<Course> courses;

}
