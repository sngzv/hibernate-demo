package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.dictionary.StudyDirection;

import javax.persistence.*;

@Entity
@Table(name = "t_student_card")
@Getter
@Setter
@NoArgsConstructor
public class StudentCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @Enumerated(EnumType.ORDINAL)
    private StudyDirection direction;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
