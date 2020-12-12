package org.Lexicon.model;

import org.Lexicon.Sequencer.CourseSequencer;
import org.Lexicon.Sequencer.DateSequencer;
import org.Lexicon.Sequencer.SchoolSequencer;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Course {

    private final int id;
    private String courseName;
    private final LocalDate startDate;
    private int weekDuration;
    private List<Student> students;


    // Created two constructors : one where we can add only acourse without adding students to it AND ONE THAT CARRY ALL

    public Course(String courseName, int weekDuration) {
        this.weekDuration = weekDuration;
        this.id = SchoolSequencer.getnextId();
        startDate = DateSequencer.getDate();
        this.courseName = courseName;
    }

    public Course(Course Course, List<Student> students) {
        this.id = CourseSequencer.getnextId();
        this.startDate = DateSequencer.getDate();
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public LocalDate getStartDate() {

        return startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }



    public void setStudents(List<Student> students) {
        this.students = students;
    }






    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", CourseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", students=" + students +
                '}';
    }
}
