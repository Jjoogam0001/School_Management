package org.Lexicon.model;


import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CourseTest {

    Course course;
    Student student;

    @Before
    public void setUp() {
        course = new Course("JavaScript",11);
        student = new Student("Martin","Jjoogam@gmail.com","Kireka");

    }


    @Test
    public void addStudent() {
        course.addStudent(student);
        assertEquals(Arrays.asList(student),course.getStudents());
    }

    @Test
    public void removeStudent() {
        course.removeStudent(student);
        List<Student> actual = new ArrayList<>();
        assertEquals(actual,course.getStudents() );
    }

    @Test
    public void getId() {
        int expected = 1;
        int actual = course.getId();
        assertEquals(expected,actual);

    }

    @Test
    public void getCourseName() {
        String actual  = "JavaScript";
        String expected = course.getCourseName();
        assertEquals(expected,actual);

    }

    @Test
    public void getStartDate() {
        LocalDate actual = LocalDate.now();
        LocalDate expected = course.getStartDate();
        assertEquals(expected,actual);
    }

    @Test
    public void getWeekDuration() {
        int expected = 11;
        int actual = course.getWeekDuration();
        assertEquals(expected,actual);
    }



}