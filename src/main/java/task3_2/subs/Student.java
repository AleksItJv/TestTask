package task3_2.subs;

import task3_2.units.Group;
import java.util.Objects;

public class Student extends Person {

    private Group group;

    public Student() {
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    public void addGroup(Group group) {
        this.group = group;
        group.addStudent(this);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return super.getName().equals(student.getName()) && super.getSurname().equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName());
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "}";
    }
}
