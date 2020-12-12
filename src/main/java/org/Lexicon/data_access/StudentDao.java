package org.Lexicon.data_access;

import org.Lexicon.model.Student;

import java.util.List;

public interface StudentDao {

    Student saveStudent(Student student);
    Student findbyEmail(String email);
    List<Student> findbyName(String name);
    Student findById(int id);
    List<Student> findAll();
    boolean deleteStudent(Student student);
}
