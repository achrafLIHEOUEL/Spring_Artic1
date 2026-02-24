package org.example.artic1_spring.Repository;

import org.example.artic1_spring.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
