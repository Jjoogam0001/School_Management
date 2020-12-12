package org.Lexicon.data_access;

import org.Lexicon.model.Course;
import org.Lexicon.model.Student;

import java.util.*;

import static java.util.Arrays.asList;

public class StudentDaoList implements  StudentDao{

    public static List <Student> students = new ArrayList<>();

    static {
        students.addAll(Arrays.asList(new Student("Martin", "jjooh@gmail.com", "Kristianstad"),new Student("Jimmy", "jjooh@gmail.com", "Kristianstad")));
    }





    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        for(int i = 0; i < students.size();i++){
            return student;
        }
        return null;
    }



    @Override
    public Student findbyEmail(String email) {

        for (int i = 0; i< students.size(); i++){
            if (email.equals(students.get(i).getEmail())){
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Student> findbyName(String name) {
        for (int i = 0; i< students.size(); i++){
            if (name.equals(students.get(i).getName())){
                return Arrays.asList(students.get(i));
            }
        }
        return null;
    }

    @Override
    public Student findById(int id) {
        for (int i = 0; i< students.size(); i++){
            if (id == students.get(i).getId()){
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
     return students;
    }

    @Override
    public boolean deleteStudent(Student student) {
        if (students == null){
            return false;
        }else{
            students.remove(student);
        }
        return true;

    }


    }

