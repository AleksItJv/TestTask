package task3_2.units;

import task3_2.subs.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Department {

    private String name;
    private Set<Group> groups = new HashSet<>();
    private Set<Teacher> teachers = new HashSet<>();
    private Faculty faculty;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGroup(Group group) {
        groups.add(group);
        group.setDepartment(this);
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void deleteGroup(Group group) {
        groups.remove(group);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.setDepartment(this);
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Department{" + name + '}';
    }
}
