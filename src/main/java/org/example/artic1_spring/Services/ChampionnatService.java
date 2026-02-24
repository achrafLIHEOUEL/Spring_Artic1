package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.ChampionnatRepository;
import org.example.artic1_spring.entities.Championnat;
import org.example.artic1_spring.entities.Pilote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChampionnatService implements  IChampionnatService {

    @Autowired
    ChampionnatRepository cr;

    @Override
    public String addChampionnat(Championnat championnat) {
        cr.save(championnat);
        return "added successfully ";
    }
}
