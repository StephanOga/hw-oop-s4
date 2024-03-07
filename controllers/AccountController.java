package controllers;

import domen.Person;
import domen.*;
import java.util.List;

public class AccountController<T> {
    public static <T extends WorkingPerson, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " получил зарплату в сумме " + salary);
    }

    public static <T extends Person> double averageAge(List<T> person) { // Функция создана для подсчета среднего возраста в универе
        double sum = 0;
        for (int i = 0; i < person.size(); i++) {
            sum += person.get(i).getAge();
        }
        System.out.println("Средний возраст среди людей в университете: " + sum / person.size());
        return sum / person.size();
    }

}
