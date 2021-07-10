package task3_2.subs;

import task3_2.units.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher extends Person {

    private Set<Subject> subjects = new HashSet<>();
    private Group group;
    private Department department;

    public Teacher() {
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public void addSubject(Subject newSubject) {
        subjects.add(newSubject);
        newSubject.setTeacher(this);
    }

    public Set<Subject> getSubject() {
        return subjects;
    }

    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return super.getName().equals(teacher.getName()) && super.getSurname().equals(teacher.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName());
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + "}";
    }
}
