package org.example.utill;

import org.example.entity.Student;
import org.example.entity.StudentCard;
import org.example.entity.Teacher;
import org.example.entity.University;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;


public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties properties = new Properties();
//                properties.setProperty(Environment.DRIVER, "org.postgresql.Driver");
//                properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/hiber_db");
//                properties.setProperty(Environment.USER, "admin");
//                properties.setProperty(Environment.PASS, "password");
//                properties.setProperty(Environment.DEFAULT_SCHEMA, "public");
//
//                properties.setProperty(Environment.HBM2DDL_AUTO, "update");
//
//                properties.setProperty(Environment.SHOW_SQL, "true");
//                properties.setProperty(Environment.FORMAT_SQL, "true");

                properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));

                configuration.mergeProperties(properties);

//                configuration.addAnnotatedClass(UserEntity.class);
                configuration.addAnnotatedClass(Teacher.class);
                configuration.addAnnotatedClass(University.class);
                configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(StudentCard.class);

                ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sessionFactory;
    }
}
