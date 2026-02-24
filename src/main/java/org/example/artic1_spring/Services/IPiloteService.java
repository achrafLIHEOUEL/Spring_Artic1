package org.example.artic1_spring.Services;
import org.example.artic1_spring.entities.Pilote;

import java.util.List;

public interface IPiloteService {
    String ajouterPilote(Pilote pilote);
    Pilote modifierPilote(Pilote pilote);
    void supprimerPilote(Long idPilote);
    List<Pilote> listPilotes();
    Pilote recupererPilote(Long idPilote);
}
