package org.Lexicon.data_access;

import org.Lexicon.model.Course;
import org.Lexicon.model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;


public class StudentDaoListTest {

    Student student =  new Student("Martin Jjooga","jjoogam@gmail.com","Kristianstad");
    StudentDaoList com = new StudentDaoList();




    @Test
    public void saveStudent() {
        String expected = student.toString();
        String actual = String.valueOf(com.saveStudent(student));
        assertEquals(expected,actual);
    }

    @Test
    public void findbyEmail() {

        for (int i = 0 ; i < StudentDaoList.students.size(); i++){
            String expected = StudentDaoList.students.get(0).toString();
            String actual = String.valueOf(com.findbyEmail("jjooh@gmail.com"));
            assertEquals(expected,actual);
        }

    }

    @Test
    public void findbyName() {
        String expected ="["+StudentDaoList.students.get(0)+"]" ;
        String actual = String.valueOf(com.findbyName("Martin Jjooga"));
        assertEquals(expected,actual);



    }

    @Test
    public void findById() {
        String expected =StudentDaoList.students.get(0).toString() ;
        String actual = String.valueOf(com.findById(2));
        assertEquals(expected,actual);
    }

    @Test
    public void findAll() {
        String expected = String.valueOf(StudentDaoList.students);
        String actual = String.valueOf((com.findAll()));
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void deleteStudent() {
        boolean expected = true;
        boolean actual = com.deleteStudent(student);
        assertEquals(expected,actual);
    }
}