package task3_2.units;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Faculty {

    private String name;
    private Set<Department> departments = new HashSet<>();
    private University uni;

    public Faculty() {
    }

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
        department.setFaculty(this);
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void deleteDepartment(Department department) {
        departments.remove(department);
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return name.equals(faculty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Faculty{" + name + '}';
    }
}
