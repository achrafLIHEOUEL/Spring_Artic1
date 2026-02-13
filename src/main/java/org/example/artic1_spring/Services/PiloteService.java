package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.PiloteRepository;
import org.example.artic1_spring.Services.IPiloteService;
import org.example.artic1_spring.entities.Pilote;

public class PiloteService implements IPiloteService {
    PiloteRepository pr;

    @Override
    public String addPiole(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
}