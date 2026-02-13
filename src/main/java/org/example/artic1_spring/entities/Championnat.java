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



    @ManyToMany
    @JoinTable(
            name = "championnat_course",
            joinColumns = @JoinColumn(name = "championnat_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    @OneToOne
    @JoinColumn(name = "detail_championnat_id")
    private DetailChampionnat detail;

}
