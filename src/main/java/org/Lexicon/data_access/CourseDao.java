package org.Lexicon.data_access;

import org.Lexicon.model.Course;
import org.Lexicon.model.Student;

import java.time.LocalDate;
import java.util.List;

public interface CourseDao {

    Course saveCourse(Course course);
    Course findById(int id);
    List<Course> findbyName(String name);
    List<Course> findByDate(LocalDate date);
    List<Course> findAll();
    boolean removeCourse(Course course);
}
