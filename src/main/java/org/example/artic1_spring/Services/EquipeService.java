package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.EquipeRepository;
import org.example.artic1_spring.entities.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService implements IEquipeService {

    @Autowired
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
    @Override
    public Equipe modifierEquipe(Equipe equipe) {
        return er.save(equipe);
    }

    @Override
    public void supprimerEquipe(Long idEquipe) {
        er.deleteById(idEquipe);
    }

    @Override
    public List<Equipe> listEquipes() {
        return er.findAll();
    }

    @Override
    public Equipe recupererEquipe(Long idEquipe) {
        return er.findById(idEquipe).orElse(null);
    }
}
