package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.EquipeRepository;
import org.example.artic1_spring.entities.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService implements IEquipeService {

    @Autowired
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }

}
