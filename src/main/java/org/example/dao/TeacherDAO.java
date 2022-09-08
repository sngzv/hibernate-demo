package org.example.dao;

import org.example.entity.Teacher;
import org.example.utill.HibernateUtil;
import org.hibernate.Session;

public class TeacherDAO {

    public Teacher getTeacherById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        return session.get(Teacher.class, id);
    }
}
