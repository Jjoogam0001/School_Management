package org.Lexicon.data_access;

import org.Lexicon.model.Course;
import org.Lexicon.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseDaoList implements  CourseDao{

    public static List<Course> courses = new ArrayList<>();

    static{
        courses.add(new Course("Java",5));
        courses.add(new Course("JavaScript",9));
        courses.add(new Course("C#",11));
    }



    @Override
    public Course saveCourse(Course course) {
        courses.add(course);
        for(int i = 0; i < courses.size();i++){
            return course;
        }
        return null;
    }

    @Override
    public Course findById(int id) {
        for (int i = 0; i< courses.size(); i++){
            if (id == courses.get(i).getId()){
                return courses.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Course> findbyName(String name) {
        for (int i = 0; i< courses.size(); i++){
            if (name.equals(courses.get(i).getCourseName())){
                return Arrays.asList(courses.get(i));
            }
        }
        return null;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        for (int i = 0; i< courses.size(); i++){
            if (LocalDate.parse(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))).equals(LocalDate.parse(courses.get(i).getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))) ){
                return Arrays.asList(courses.get(i));
            }


        }
        return null;
    }

    @Override
    public List<Course> findAll() {
        return courses;
    }

    @Override
    public boolean removeCourse(Course course) {
        if (course == null){
            return false;
        }else{
            courses.remove(course);
        }
        return true;

    }
}
