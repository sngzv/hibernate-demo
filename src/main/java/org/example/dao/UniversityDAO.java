package org.example.dao;

import org.example.entity.University;
import org.example.utill.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UniversityDAO {

    public void saveUniversity(University university) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(university);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                e.printStackTrace();
            }
        }
    }
}
