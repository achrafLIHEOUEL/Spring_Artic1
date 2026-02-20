package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.SponsorService;
import org.example.artic1_spring.entities.Sponsor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sponsor")
public class SponsorController {

    @Autowired
    private SponsorService sponsorService;

    // POST - ajouter un sponsor
    @PostMapping
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }

    // POST - ajouter plusieurs sponsors
    @PostMapping("/liste")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    // PUT - modifier un sponsor
    @PutMapping
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }

    // DELETE - supprimer un sponsor
    @DeleteMapping("/{idSponsor}")
    public void supprimerSponsor(@PathVariable Long idSponsor) {
        sponsorService.supprimerSponsor(idSponsor);
    }

    // GET - liste tous les sponsors
    @GetMapping
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    // GET - récupérer un sponsor par id
    @GetMapping("/{idSponsor}")
    public Sponsor recupererSponsor(@PathVariable Long idSponsor) {
        return sponsorService.recupererSponsor(idSponsor);
    }

    // PUT - archiver un sponsor
    @PutMapping("/archiver/{idSponsor}")
    public Boolean archiverSponsor(@PathVariable Long idSponsor) {
        return sponsorService.archiverSponsor(idSponsor);
    }
}