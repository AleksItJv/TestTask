package task3_2.subs;

import task3_2.units.Group;
import java.util.Objects;

public class Subject {

    private String name;
    private Group group;
    private Teacher teacher;

    private Subject(String name) {
        this.name = name;
    }

    public void addGroup(Group group) {
        this.group = group;
        group.addSubject(this);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public static Subject createSubject(String name) {
        return new Subject(name);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return name.equals(subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Subject{" + name + '}';
    }
}
