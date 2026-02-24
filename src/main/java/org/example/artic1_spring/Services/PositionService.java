package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.PositionRepository;
import org.example.artic1_spring.entities.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    PositionRepository pr;

    @Override
    public Position ajouterPosition(Position position) {
        return pr.save(position);
    }

    @Override
    public Position modifierPosition(Position position) {
        return pr.save(position);
    }

    @Override
    public void supprimerPosition(Long idPosition) {
        pr.deleteById(idPosition);
    }

    @Override
    public List<Position> listPositions() {
        return pr.findAll();
    }

    @Override
    public Position recupererPosition(Long idPosition) {
        return pr.findById(idPosition).orElse(null);
    }
}