package domen;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNum;
    private List<StudentGroup> studentList;


    public StudentSteam(int steamNum, List<StudentGroup> studentList) {
        this.steamNum = steamNum;
        this.studentList = studentList;
    }

    public int getSteamNum() {
        return steamNum;
    }

    public void setSteamNum(int steamNum) {
        this.steamNum = steamNum;
    }

    public List<StudentGroup> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentGroup> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "steamNum=" + steamNum +
                ", studentList=" + studentList +
                ", steamSize=" + studentList.size() +
                "}";
    }

    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            int index = -1;

            @Override
            public boolean hasNext() {
                return index + 1 < studentList.size();
            }

            @Override
            public StudentGroup next() {
                index++;
                if (index >= 0 && index < studentList.size()) {
                    return studentList.get(index);
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }

}
