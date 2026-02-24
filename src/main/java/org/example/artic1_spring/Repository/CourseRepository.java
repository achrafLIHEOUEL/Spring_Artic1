package org.example.artic1_spring.Repository;

import org.example.artic1_spring.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
