package org.Lexicon.data_access;

import org.Lexicon.model.Course;
import org.Lexicon.model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CourseDaoListTest {


    CourseDaoList com = new CourseDaoList();
    Course course ;



  @Before
  public void setUp(){
      course = new Course("Java Course",5);




  }

    @Test
    public void saveCourse() {
      String expected = course.toString();
      String actual = String.valueOf(com.saveCourse(course));
      assertEquals(expected,actual);

    }

    @Test
    public void findById() {

      String expected = String.valueOf(CourseDaoList.courses.get(0));
      String actual = String.valueOf(com.findById(1));
      assertEquals(expected,actual);

  }

    @Test
    public void findbyName() {
        String expected = ("["+ String.valueOf(CourseDaoList.courses.get(0))+"]");
        String actual = String.valueOf(com.findbyName("Java Course"));
        assertEquals(expected,actual);
    }

    @Test
    public void findByDate() {

        String expected = ("["+ String.valueOf(CourseDaoList.courses.get(0))+"]");
        String date = "2020-12-12";
        LocalDate LocalDate = java.time.LocalDate.parse(date);
        String actual = String.valueOf(com.findByDate(LocalDate));
        assertEquals(expected,actual);



    }

    @Test
    public void findAll() {
      List<List<Course>> expected = Arrays.asList(CourseDaoList.courses);
      List<List<Course>> actual = Arrays.asList(com.findAll());
      assertEquals(expected,actual);



    }

    @Test
    public void removeCourse() {

        boolean expected = true;
        boolean actual = com.removeCourse(course);
        assertEquals(expected,actual);


    }
}