package org.example.artic1_spring.Services;

import org.example.artic1_spring.entities.Position;
import java.util.List;

public interface IPositionService {
    Position ajouterPosition(Position position);
    Position modifierPosition(Position position);
    void supprimerPosition(Long idPosition);
    List<Position> listPositions();
    Position recupererPosition(Long idPosition);
}