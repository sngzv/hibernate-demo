package org.example.entity;

import lombok.Data;
import org.example.dictionary.EducationType;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "t_student")
public class Student extends BusinessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PersonDetailInfo personDetailInfo;

    @Column(name = "education_type")
    @Enumerated(EnumType.STRING)
    private EducationType educationType;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @OneToOne
    @JoinColumn(name = "card_id")
    private StudentCard studentCard;

    @ManyToMany(mappedBy = "students")
    private List<Teacher> teachers = new ArrayList<>();
}

//    public void removeTeacher(Teacher t) {
//        this.teachers.remove(t);
//        t.getStudents().remove(this);
//    }
//}
