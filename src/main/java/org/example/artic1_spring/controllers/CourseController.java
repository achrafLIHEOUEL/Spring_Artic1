package org.example.artic1_spring.controllers;

import org.example.artic1_spring.Services.CourseService;
import org.example.artic1_spring.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course ajouterCourse(@RequestBody Course course) {
        return courseService.ajouterCourse(course);
    }

    @PutMapping
    public Course modifierCourse(@RequestBody Course course) {
        return courseService.modifierCourse(course);
    }

    @DeleteMapping("/{idCourse}")
    public void supprimerCourse(@PathVariable Long idCourse) {
        courseService.supprimerCourse(idCourse);
    }

    @GetMapping
    public List<Course> listCourses() {
        return courseService.listCourses();
    }

    @GetMapping("/{idCourse}")
    public Course recupererCourse(@PathVariable Long idCourse) {
        return courseService.recupererCourse(idCourse);
    }
}