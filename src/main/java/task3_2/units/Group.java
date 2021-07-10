package task3_2.units;

import task3_2.subs.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Group {

    private String name;
    private String codeSpecialisation;
    private Set<Student> students = new HashSet<>();
    private Set<Subject> subjects = new HashSet<>();
    private Teacher curator;
    private Department department;

    public Group() {
    }

    public Group(String name, String codeSpecialisation) {
        this.name = name;
        this.codeSpecialisation = codeSpecialisation;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
        newStudent.setGroup(this);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        subject.setGroup(this);

    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }

    public String getCodeSpecialisation() {
        return codeSpecialisation;
    }

    public void setCodeSpecialisation(String codeSpecialisation) {
        this.codeSpecialisation = codeSpecialisation;
    }

    public Teacher getCurator() {
        return curator;
    }

    public void addCurator(Teacher curator) {
        this.curator = curator;
        curator.setGroup(this);
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
        Group group = (Group) o;
        return codeSpecialisation.equals(group.codeSpecialisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeSpecialisation);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", codeSpecialisation='" + codeSpecialisation + '\'' +
                '}';
    }
}
