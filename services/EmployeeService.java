package services;

import domen.Employee;
import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;


    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        employees.add(new Employee(name, age, "Актер"));
        this.count++;
    }

    public void sortByFIO() {
        this.employees.sort(new PersonComparator<Employee>());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
