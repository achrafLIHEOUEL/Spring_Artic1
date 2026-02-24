package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.EquipeService;
import org.example.artic1_spring.entities.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Equipe")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    @PostMapping
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }

    @PutMapping
    public Equipe modifierEquipe(@RequestBody Equipe equipe) {
        return equipeService.modifierEquipe(equipe);
    }

    @DeleteMapping("/{idEquipe}")
    public void supprimerEquipe(@PathVariable Long idEquipe) {
        equipeService.supprimerEquipe(idEquipe);
    }

    @GetMapping
    public List<Equipe> listEquipes() {
        return equipeService.listEquipes();
    }

    @GetMapping("/{idEquipe}")
    public Equipe recupererEquipe(@PathVariable Long idEquipe) {
        return equipeService.recupererEquipe(idEquipe);
    }
}
