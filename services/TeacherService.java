package services;

import domen.Employee;
import domen.PersonComparator;
import domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;


    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        teachers.add(new Teacher(name, age, "Мучитель"));
        this.count++;
    }

    public void printAll() {
        sortTeacher();
        System.out.println(this.teachers);
    }

    public void sortByFIO() {
        this.teachers.sort(new PersonComparator<Teacher>());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void sortTeacher() {
        this.teachers.sort(new PersonComparator<Teacher>());
    }

}
