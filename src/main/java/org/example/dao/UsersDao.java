package org.example.dao;

import org.example.utill.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UsersDao {

//    public void saveUser(UserEntity user) {
//
//        Transaction transaction = null;
//
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//
//            transaction = session.beginTransaction();
//
//            session.save(user);
//
////            transaction.commit();
//
////            session.close();
//
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//    }
}
