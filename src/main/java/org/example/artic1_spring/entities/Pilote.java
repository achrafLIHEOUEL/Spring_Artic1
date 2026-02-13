package org.example.artic1_spring.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positions;

    @ManyToOne
    @JoinColumn(name = "sponsor_id")
    private Sponsor sponsor;
}
