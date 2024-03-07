package services;

import domen.Person;
import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;


    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return this.students;
    }

    @Override
    public void create(String name, int age) {
        students.add(new Student(name, age));
        this.count++;
    }

    public void sortByFIO() {
        this.students.sort(new PersonComparator<Student>());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
