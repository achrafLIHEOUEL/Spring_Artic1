package org.example.artic1_spring.Repository;

import org.example.artic1_spring.entities.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {

}