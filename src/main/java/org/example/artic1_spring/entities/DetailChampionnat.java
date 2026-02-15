package org.example.artic1_spring.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class DetailChampionnat {
    @Id
    private String code;
    private String description;

    @OneToOne(mappedBy = "detail")
    private Championnat championnat;
}
