package org.example.artic1_spring.Repository;

import org.example.artic1_spring.entities.DetailChampionnat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<DetailChampionnat, String> {
}
