package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.PiloteService;
import org.example.artic1_spring.entities.Pilote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pilote")
public class PiloteController {

    @Autowired
    private PiloteService piloteService;

    // POST - ajouter un pilote
    @PostMapping
    public String addPilote(@RequestBody Pilote pilote) {
        return piloteService.addPiole(pilote);
    }
}