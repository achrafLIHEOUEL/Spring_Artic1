package org.example.artic1_spring.Services;

import org.example.artic1_spring.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    void supprimerContrat(Long idContrat);
    List<Contrat> listContrats();
    Contrat recupererContrat(Long idContrat);
}
