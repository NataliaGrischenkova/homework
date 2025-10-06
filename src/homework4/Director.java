package homework4;


import java.util.Arrays;
import java.util.Objects;

import static java.util.Objects.isNull;

public class Director extends Employee implements Search {

    private Employee[] employees;

    public Director(String name, String lastName, Integer experience) {
        super(name, lastName, experience);
    }

    public void addWorker(Employee employee) {
        if(isNull(employees)) {
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length +1);
            employees[employees.length -1] = employee;

        }
    }

    @Override
    public Integer getSalary() {
        if(isNull(employees)) {
            return super.getSalary();
        } else {
            return super.getSalary() * employees.length;
        }
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.DIRECTOR;
    }

    @Override
    public String toString() {
        return "Director{" +
                "employees=" + Arrays.toString(employees) +
                ", profession=" + profession +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + getSalary() +
                '}';
    }


    @Override
    public void findEmployeeByName(String name) {
        if(isNull(employees)) {
            System.out.println("У директора  " + this.name + " нет подчиненных.");
            return;
        }

        for (Employee empl : employees) {
            if (empl.name.equals(name)) {
                System.out.println("Сотрудник " + name + " находится в подчинении у директора " + this.name);
                return;
            }
        }
        System.out.println("Сотрудник " + name + " не найден среди подчиненных директора " + this.name);
    }
}
