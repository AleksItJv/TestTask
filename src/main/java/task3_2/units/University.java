package task3_2.units;

import task3_2.subs.Subject;
import java.util.HashSet;
import java.util.Set;

public class University {

    private String name;
    private Set<Faculty> faculties = new HashSet<>();
    private Set<Subject> subjects = new HashSet<>();

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        faculty.setUni(this);
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public void deleteFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public Subject newSubject(String name) {
        Subject subject = Subject.createSubject(name);
        subjects.add(subject);
        return subject;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "University{" + name + '}';
    }
}
