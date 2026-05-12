package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ClassGroup {

    private String name;
    private List<Student> students;

    public ClassGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void removeByEnrollments(int x) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getEnrollments() > x) {
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "\nClassGroup{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}