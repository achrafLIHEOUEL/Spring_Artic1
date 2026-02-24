package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.PiloteRepository;
import org.example.artic1_spring.Services.IPiloteService;
import org.example.artic1_spring.entities.Pilote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiloteService implements IPiloteService {

    @Autowired
    PiloteRepository pr;

    @Override
    public String ajouterPilote(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
    @Override
    public Pilote modifierPilote(Pilote pilote) {
        return pr.save(pilote);
    }

    @Override
    public void supprimerPilote(Long idPilote) {
        pr.deleteById(idPilote);
    }

    @Override
    public List<Pilote> listPilotes() {
        return pr.findAll();
    }

    @Override
    public Pilote recupererPilote(Long idPilote) {
        return pr.findById(idPilote).orElse(null);
    }
}