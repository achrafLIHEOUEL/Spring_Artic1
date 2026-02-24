package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.DetailService;
import org.example.artic1_spring.entities.DetailChampionnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private DetailService detailService;

    @PostMapping
    public DetailChampionnat ajouterDetail(@RequestBody DetailChampionnat detail) {
        return detailService.ajouterDetail(detail);
    }

    @PutMapping
    public DetailChampionnat modifierDetail(@RequestBody DetailChampionnat detail) {
        return detailService.modifierDetail(detail);
    }

    @DeleteMapping("/{code}")
    public void supprimerDetail(@PathVariable String code) {
        detailService.supprimerDetail(code);
    }

    @GetMapping
    public List<DetailChampionnat> listDetails() {
        return detailService.listDetails();
    }

    @GetMapping("/{code}")
    public DetailChampionnat recupererDetail(@PathVariable String code) {
        return detailService.recupererDetail(code);
    }
}