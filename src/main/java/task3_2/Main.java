package task3_2;

import task3_2.subs.*;
import task3_2.units.*;


public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Bob", "Dilan");
        Student student2 = new Student("Mark", "Cuker");
        Student student3 = new Student("Lee", "Cooper");
        Student student4 = new Student("Lisa", "Antonova");


        Department dep1 = new Department("ITCourse");
        Department dep2 = new Department("EconomicCourse");
        Group group1 = new Group("Web", "it1");
        Group group2 = new Group("Finance", "f1");
/*        Subject subject1 = Subject.createSubject("Design");
        Subject subject2 = Subject.createSubject("Frontend");
        Subject subject3 = Subject.createSubject("Audit");
        Subject subject4 = Subject.createSubject("Management");*/
        //Subject subject4 = new Subject("Management");

        Teacher teacher1 = new Teacher("Marta", "Ivasian");
        Teacher teacher2 = new Teacher("Bogdan", "Fly");
        Faculty faculty = new Faculty("IT Faculty");
        University uni = new University("Smart University");


        Subject subject1 = uni.newSubject("XXC");
        Subject subject2 = uni.newSubject("XXD");
        Subject subject3 = uni.newSubject("XXE");
        Subject subject4 = uni.newSubject("XXF");
        group1.addSubject(subject1);
        group1.addSubject(subject2);
        group2.addSubject(subject3);
        group2.addSubject(subject4);
        System.out.println(subject1.getGroup());

        System.out.println(group1.getSubjects());
        System.out.println(uni.getSubjects());


        student3.addGroup(group1);
        group1.addStudent(student1);
        group1.addStudent(student2);

        group1.addSubject(subject1);
        group1.addSubject(subject2);
/*        group2.addSubject(subject3);
        group2.addSubject(subject4);
        subject3.addGroup(group2);
        subject4.addGroup(group2);*/


        group2.addCurator(teacher1);
        dep1.addGroup(group1);
        dep1.addGroup(group2);
        dep1.deleteGroup(group2);
        dep1.addTeacher(teacher1);
        dep1.addTeacher(teacher2);

        faculty.addDepartment(dep1);
        faculty.addDepartment(dep2);
        System.out.println(faculty);
        System.out.println(faculty.getDepartments());
        System.out.println();
        uni.addFaculty(faculty);
        System.out.println(faculty.getUni());
        System.out.println(uni.getFaculties());
        System.out.println(uni.getName());
        uni.setName("asdasd");
        System.out.println(uni.getName());


    }
}
