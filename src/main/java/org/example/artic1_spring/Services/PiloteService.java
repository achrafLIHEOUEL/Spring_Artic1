package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.PiloteRepository;
import org.example.artic1_spring.Services.IPiloteService;
import org.example.artic1_spring.entities.Pilote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiloteService implements IPiloteService {

    @Autowired
    PiloteRepository pr;

    @Override
    public String addPiole(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
}