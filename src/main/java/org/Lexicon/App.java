package org.Lexicon;


import org.Lexicon.data_access.CourseDaoList;
import org.Lexicon.data_access.StudentDaoList;
import org.Lexicon.model.Course;
import org.Lexicon.model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class App
{



    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            CourseDaoList cvd = new CourseDaoList();
            StudentDaoList svd = new StudentDaoList();
            menu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How many students you want to register");
                    int numberOfStudents = input.nextInt();
                    for (int i = 1; i <= numberOfStudents; i++) {
                        System.out.println("Name of student: " + i);
                        String name = input.next();
                        System.out.println("Email: " + i);
                        String email = input.next();
                        System.out.println("Address " + i);
                        String address = input.next();

                        //Add student to to student Object
                        Student students = new Student(name, email, address);
                        // Add into the array list
                        StudentDaoList.students.add(students);
                        System.out.println("Student Added");
                    }

                    System.out.println("Create Course");
                    System.out.println("Name of Course: ");
                    String name = input.next();
                    System.out.println("weekDuration: ");
                    int weekDuration = input.nextInt();
                    Course course = new Course(name, weekDuration);
                    CourseDaoList.courses.add(course);
                    break;
                case 2:
                    System.out.println("Here is alist of courses and students");
                    System.out.println("----------------------");
                    CourseDaoList cDl = new CourseDaoList();
                    for (int i = 0; i < CourseDaoList.courses.size(); i++) {
                        System.out.println(cDl.findAll().get(i).getCourseName());
                    }
                    System.out.println("----------------------");
                    StudentDaoList sdl = new StudentDaoList();
                    for (int i = 0; i < StudentDaoList.students.size(); i++) {
                        System.out.println(sdl.findAll().get(i).getName());
                    }
                    System.out.println("What course you wanna add students?");
                    String courseName = input.next();
                    System.out.println("Name of student you want to add?");
                    String studentsName = input.next();
                    System.out.println();


                    // Add student to a course
                    for (int i = 0; i < CourseDaoList.courses.size(); i++) {
                        if (courseName.equals(CourseDaoList.courses.get(i).getCourseName())) {
                            CourseDaoList.courses.get(i).setStudents(svd.findbyName(studentsName));
                            System.out.println(cvd.findbyName(courseName));
                        }

                    }

                    System.out.println();
                    System.out.println("Remove Student from a  course");
                    System.out.println("Enter student name :");
                    String toDeleteStudentName = input.next();
                    System.out.println();
                    for (int i = 0; i < StudentDaoList.students.size(); i++) {
                        if (toDeleteStudentName.equals(StudentDaoList.students.get(i).getName())) {
                            svd.deleteStudent(StudentDaoList.students.get(i));
                            System.out.println("Done");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Email to Find Student by Email:");
                    String email = input.next();
                    System.out.println(svd.findbyEmail(email));
                    System.out.println("Enter Id to Find Student by id:");
                    int id = input.nextInt();
                    System.out.println(svd.findById(id));
                    System.out.println("Enter to Find Student by Name");
                    String nme = input.next();
                    System.out.println(svd.findbyName(nme));

                    System.out.println("---------------------");

                    System.out.println("Find courses");
                    System.out.println("Find Student by Name:");
                    String csnm = input.next();
                    System.out.println(cvd.findbyName(csnm));
                    System.out.println("Enter Id to Find by id:");
                    int id2 = input.nextInt();
                    System.out.println(cvd.findById(id2));
                    System.out.println("Find by Date");
                    String date = input.next();
                    System.out.println(cvd.findByDate(LocalDate.parse(date)));
                    break;
                case 4:
                    System.out.println(cvd.findAll());
                    System.out.println("------------------------------------");
                    System.out.println(svd.findAll());

                    System.out.println("Enter iD OF student you want to change");
                    int toChange = input.nextInt();
                    for (int i = 0; i < StudentDaoList.students.size(); i++) {
                        if (toChange == StudentDaoList.students.get(i).getId()) {
                            System.out.println("Your making changes to student: " + StudentDaoList.students.get(i));
                            System.out.println("1) Name");
                            System.out.println("2) email");
                            System.out.println("3) address");

                            int choice2 = input.nextInt();
                            switch (choice2) {
                                case 1:
                                    System.out.println("Enter Name");
                                    String cme = input.next();
                                    StudentDaoList.students.get(i).setName(cme);
                                    break;
                                case 2:
                                    System.out.println("Enter email");
                                    String ema = input.next();
                                    StudentDaoList.students.get(i).setEmail(ema);
                                    break;
                                case 3:
                                    System.out.println("Enter address");
                                    String add = input.next();
                                    StudentDaoList.students.get(i).setAddress(add);

                                    break;

                            }
                            System.out.println("Enter iD OF Course you want to change");
                            int toChange2 = input.nextInt();
                            for (int a = 0; a < CourseDaoList.courses.size(); a++) {
                                if (toChange2 == CourseDaoList.courses.get(a).getId()) {
                                    System.out.println("Your making changes to Course: " + CourseDaoList.courses.get(a));
                                    System.out.println("1) Name");
                                    System.out.println("2) Week duration");

                                    int choice3 = input.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            System.out.println("Enter Name");
                                            String cme = input.next();
                                            CourseDaoList.courses.get(a).setCourseName(cme);
                                            break;
                                        case 2:
                                            System.out.println("Week duration");
                                            int ema = input.nextInt();
                                            CourseDaoList.courses.get(a).setWeekDuration(ema);
                                            break;
                                    }

                                }


                            }


                            break;


                        }


                    }
                    ;


            }
        } while (choice <= 4);
    }


    public static void menu(){
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("(1) Create new Courses and Students");
        System.out.println("(2) Register and Remove Students to / From Courses");
        System.out.println("(3) Finding Students and Courses");
        System.out.println("(4) Edit Students and Course");

    }
}
