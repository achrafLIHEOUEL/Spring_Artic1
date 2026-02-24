package org.example.artic1_spring.Repository;

import org.example.artic1_spring.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {


}
