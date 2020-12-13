package org.Lexicon.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student("Ericsson","Eric@gmail.com","Växjö");


    }


    @Test
    public void getId() {
        int expected = 1;
        int actual = student.getId();
        assertEquals(expected,actual);
    }

    @Test
    public void getName() {
        String expected = "Ericsson";
        String actual = student.getName();
        assertEquals(expected,actual);

    }

    @Test
    public void getEmail() {
        String expected = "Eric@gmail.com";
        String actual = student.getEmail();
        assertEquals(expected,actual);

    }

    @Test
    public void getAddress() {
        String expected = "Växjö";
        String actual = student.getAddress();
        assertEquals(expected,actual);
    }

    @Test
    public void setName() {
     student.setName("Jjooga");
     assertEquals("Jjooga",student.getName());

    }

    @Test
    public void setEmail() {
        student.setEmail("hello@gmail.com");
        assertEquals("hello@gmail.com",student.getEmail());
    }

    @Test
    public void setAddress() {
        student.setAddress("Växjö");
        assertEquals("Växjö",student.getAddress());
    }


}