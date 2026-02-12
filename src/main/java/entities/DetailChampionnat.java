package entities;


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

    @OneToMany(mappedBy = "DetailChampionnat", cascade = CascadeType.ALL)
    private List<Chompionnat> championnats;
}
