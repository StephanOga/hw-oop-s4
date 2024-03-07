package domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private int idStudentGroup;
    private List<Student> studentList;

    public StudentGroup(int idStudentGroup, List<Student> studentList) {
        this.idStudentGroup = idStudentGroup;
        this.studentList = studentList;
    }


    public int getIdStudentGroup() {
        return idStudentGroup;
    }

    public void setIdStudentGroup(int idStudentGroup) {
        this.idStudentGroup = idStudentGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "idStudentGroup=" + idStudentGroup +
                ", studentList=" + studentList +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.getStudentList().size(), o.getStudentList().size());
    }
}
