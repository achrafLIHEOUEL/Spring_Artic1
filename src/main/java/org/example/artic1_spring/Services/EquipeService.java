package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.EquipeRepository;
import org.example.artic1_spring.entities.Equipe;

public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }

}
