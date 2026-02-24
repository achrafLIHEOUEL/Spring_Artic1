package org.example.artic1_spring.controllers;


import org.example.artic1_spring.Services.ChampionnatService;
import org.example.artic1_spring.Services.IChampionnatService;
import org.example.artic1_spring.entities.Championnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Championnat")
public class ChampionnatController {

    @Autowired
    private ChampionnatService championnatServices;

    @PostMapping
    public String addChampionnat(@RequestBody Championnat championnat)
    {return championnatServices.addChampionnat(championnat); }


}
