package org.example;

import org.example.dictionary.ActionType;
import org.example.dictionary.EducationType;
import org.example.entity.PersonDetailInfo;
import org.example.entity.SequenceGeneratorEntity;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.utill.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Transaction transaction = session1.getTransaction();
//        transaction.begin();
//
//        sessionFactory.getCriteriaBuilder().selectCase().alias();
//
//        Student student = session1.get(Student.class, 1L);
//        Teacher firstTeacher = student.getTeachers().stream()
//                .filter(t -> t.getId() == 1L)
//                .findFirst().orElseThrow();
//
//        student.removeTeacher(firstTeacher);
//        session1.persist(student);
//
//        transaction.commit();
//        session1.close();
//
//        System.out.println("Press ENTER");
//        new Scanner(System.in).nextLine();
//
//        sessionFactory.close();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        PersonDetailInfo personDetailInfo = new PersonDetailInfo();
        personDetailInfo.setName("Dima7");
        personDetailInfo.setSurname("Hibernate7");
        personDetailInfo.setPatronymic("Test7");

        student.setPersonDetailInfo(personDetailInfo);
        student.setEducationType(EducationType.BUDGET);

        session.persist(student);

        transaction.commit();
        session.close();

        sessionFactory.close();

//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Session session2 = sessionFactory.openSession();
//        Session session3 = sessionFactory.openSession();
//
//        Transaction transaction1 = session1.getTransaction();
//        transaction1.begin();
//
//        SequenceGeneratorEntity sequenceGenerator = new SequenceGeneratorEntity();
//        sequenceGenerator.setValue("OMGlvlf");
//
//        session1.save(sequenceGenerator);
////        transaction1.commit();
//
//        Transaction transaction2 = session2.getTransaction();
//        transaction2.begin();
//
//        Student student = new Student();
//        student.setName("test");
//        student.setPatronymic("kfjkff");
//
//        session2.save(student);
////        transaction2.commit();
//
//        Transaction transaction3 = session3.getTransaction();
//        transaction3.begin();
//
//        Teacher teacher = new Teacher();
//        teacher.setName("fkfkfkf");
//
//        session3.save(teacher);
////        transaction3.commit();
////        session3.flush();
//
//
//        session1.close();
//        session2.close();
//        session3.close();
//        sessionFactory.close();
    }
}