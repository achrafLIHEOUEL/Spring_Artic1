package entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;
    private LocalDate dateCourse;

    @ManyToOne
    @JoinColumn(name = "championnat_id", nullable = false)
    private Chompionnat championnat;

    @OneToMany(mappedBy = "course")
    private List<Position> positions;
}
