package org.example.artic1_spring.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class DetailChampionnat {
    @Id
    private String code;
    private String description;

    @OneToMany(mappedBy = "detailChampionnat", cascade = CascadeType.ALL)
    private List<Championnat> championnats;
}
