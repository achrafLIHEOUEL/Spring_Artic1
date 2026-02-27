package org.example.artic1_spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positions;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
}