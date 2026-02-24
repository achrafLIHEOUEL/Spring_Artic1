package org.example.artic1_spring.Services;

import org.example.artic1_spring.entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe ajouterEquipe(Equipe equipe);
    Equipe modifierEquipe(Equipe equipe);
    void supprimerEquipe(Long idEquipe);
    List<Equipe> listEquipes();
    Equipe recupererEquipe(Long idEquipe);
}
