package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.CourseRepository;
import org.example.artic1_spring.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    CourseRepository cr;

    @Override
    public Course ajouterCourse(Course course) {
        return cr.save(course);
    }

    @Override
    public Course modifierCourse(Course course) {
        return cr.save(course);
    }

    @Override
    public void supprimerCourse(Long idCourse) {
        cr.deleteById(idCourse);
    }

    @Override
    public List<Course> listCourses() {
        return cr.findAll();
    }

    @Override
    public Course recupererCourse(Long idCourse) {
        return cr.findById(idCourse).orElse(null);
    }
}