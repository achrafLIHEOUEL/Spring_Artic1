package org.example.artic1_spring.Services;

import org.example.artic1_spring.entities.Course;
import java.util.List;

public interface ICourseService {
    Course ajouterCourse(Course course);
    Course modifierCourse(Course course);
    void supprimerCourse(Long idCourse);
    List<Course> listCourses();
    Course recupererCourse(Long idCourse);
}