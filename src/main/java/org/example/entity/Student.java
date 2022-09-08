package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_student")
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;

    private String name;

    private String patronymic;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @OneToOne
    @JoinColumn(name = "card_id")
    private StudentCard studentCard;

    @ManyToMany(mappedBy = "students")
    private Set<Teacher> teachers;
}
