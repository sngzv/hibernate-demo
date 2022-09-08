package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_teacher")
@Getter
@Setter
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;

    private String name;

    private String patronymic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id")
    private University university;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "teacher_student",
            joinColumns = { @JoinColumn(name = "teacher_id")},
            inverseJoinColumns = { @JoinColumn(name = "student_id")}
    )
    private Set<Student> students;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
