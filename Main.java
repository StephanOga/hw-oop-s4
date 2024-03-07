import controllers.AccountController;
import domen.*;
import services.TeacherService;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static List<Person> students = new ArrayList<>();

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        Student student1 = new Student("Ivan", 20);
        Student student2 = new Student("Nik", 22);
        Student student3 = new Student("Nikolas", 19);
        Student student4= new Student("Artem", 19);
        Student student5= new Student("Bro", 18);
        Student student6= new Student("Olga", 18);
        Student student7= new Student("Dima", 18);
        Student student8= new Student("Tomi", 23);
        Student student9= new Student("Ryan Gosling", 24);
        Student student10= new Student("Brother", 25);
        Student student11 = new Student("Bill", 23);
        Student student12 = new Student("Richard", 21);
        Student student13 = new Student("Franklin", 26);

        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        students1.add(student6);
        students1.add(student7);

        StudentGroup studentGroup1 = new StudentGroup(1, students1);

        for (Student student : studentGroup1) {
            System.out.println(student);
        }
        System.out.println("------------");
        Collections.sort(studentGroup1.getStudentList());
        System.out.println("------------");
        for (Student student : studentGroup1) {
            System.out.println(student);
        }

        List<Student> students2 = new ArrayList<>(); // Второй список студентов
        List<Student> students3 = new ArrayList<>(); // Третий список студентов

        // Добавление студентов в разные списки
        students2.add(student8);
        students2.add(student9);
        students2.add(student10);
        students3.add(student11);
        students3.add(student12);
        students3.add(student13);

        // Создание групп для студентов
        List<StudentGroup> studentGroupList1 = new ArrayList<>();
        List<StudentGroup> studentGroupList2 = new ArrayList<>();
        StudentGroup studentGroup2 = new StudentGroup(2, students2);
        StudentGroup studentGroup3 = new StudentGroup(3, students3);

        // Добавление студентов в эти потоки
        studentGroupList1.add(studentGroup1);
        studentGroupList1.add(studentGroup1);
        studentGroupList2.add(studentGroup2);
        studentGroupList2.add(studentGroup3);

        // Создание, сортировка и вывод потоков
        StudentSteam studentSteam1 = new StudentSteam(1, studentGroupList1);
        StudentSteam studentSteam2 = new StudentSteam(2, studentGroupList2);
        System.out.println("studentSteam1");
        System.out.println("------------");
        Collections.sort(studentSteam1.getStudentList());
        for (StudentGroup studentGroup : studentSteam1) {
            System.out.println(studentGroup);
        }
        System.out.println("------------");
        Collections.sort(studentSteam2.getStudentList());
        for (StudentGroup studentGroup : studentSteam2) {
            System.out.println(studentGroup);
        }

        // Играемся с обобщениями
        Employee worker = new Employee("Валера", 29, "Раб");
        Teacher teacher = new Teacher("Ольга", 40, "Учитель");

        AccountController.paySalary(teacher, 15000);
        AccountController.paySalary(worker, 0);

        // AccountController controller = new AccountController();
        // controller.paySalary(teacher, 15000);
        // controller.paySalary(worker, 0);

        Student Vasya = new Student("Хитрый Вуася", 18);
        // controller.paySalary(Vasya, 1000); Вуася хитрый ЛИКВИДИРОВАН! Он Person, а не WorkingPerson

        // Список всех людей в универе
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(Vasya);
        students.add(worker);
        students.add(teacher);

        AccountController.averageAge(students);

    }
}