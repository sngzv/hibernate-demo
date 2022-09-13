package org.example;

import org.example.dao.TeacherDAO;
import org.example.entity.Teacher;
import org.example.utill.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();
        Teacher teacherById = teacherDAO.getTeacherById(1L);
        System.out.println(teacherById);
    }
}