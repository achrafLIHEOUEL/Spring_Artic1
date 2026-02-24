package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.ContratService;
import org.example.artic1_spring.entities.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratController {

    @Autowired
    private ContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @DeleteMapping("/{idContrat}")
    public void supprimerContrat(@PathVariable Long idContrat) {
        contratService.supprimerContrat(idContrat);
    }

    @GetMapping
    public List<Contrat> listContrats() {
        return contratService.listContrats();
    }

    @GetMapping("/{idContrat}")
    public Contrat recupererContrat(@PathVariable Long idContrat) {
        return contratService.recupererContrat(idContrat);
    }
}