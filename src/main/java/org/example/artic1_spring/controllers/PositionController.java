package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.PositionService;
import org.example.artic1_spring.entities.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @PostMapping
    public Position ajouterPosition(@RequestBody Position position) {
        return positionService.ajouterPosition(position);
    }

    @PutMapping
    public Position modifierPosition(@RequestBody Position position) {
        return positionService.modifierPosition(position);
    }

    @DeleteMapping("/{idPosition}")
    public void supprimerPosition(@PathVariable Long idPosition) {
        positionService.supprimerPosition(idPosition);
    }

    @GetMapping
    public List<Position> listPositions() {
        return positionService.listPositions();
    }

    @GetMapping("/{idPosition}")
    public Position recupererPosition(@PathVariable Long idPosition) {
        return positionService.recupererPosition(idPosition);
    }
}