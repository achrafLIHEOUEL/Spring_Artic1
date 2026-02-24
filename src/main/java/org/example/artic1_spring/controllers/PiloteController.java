package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.PiloteService;
import org.example.artic1_spring.entities.Pilote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilote")
public class PiloteController {

    @Autowired
    private PiloteService piloteService;

    // POST - ajouter un pilote
    @PostMapping
    public String ajouterPilote(@RequestBody Pilote pilote) {
        return piloteService.ajouterPilote(pilote);
    }

    @PutMapping
    public Pilote modifierPilote(@RequestBody Pilote pilote) {
        return piloteService.modifierPilote(pilote);
    }

    @DeleteMapping("/{idPilote}")
    public void supprimerPilote(@PathVariable Long idPilote) {
        piloteService.supprimerPilote(idPilote);
    }

    @GetMapping
    public List<Pilote> listPilotes() {
        return piloteService.listPilotes();
    }

    @GetMapping("/{idPilote}")
    public Pilote recupererPilote(@PathVariable Long idPilote) {
        return piloteService.recupererPilote(idPilote);
    }
}