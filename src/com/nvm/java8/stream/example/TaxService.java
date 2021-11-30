package com.nvm.java8.stream.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {
        // return true if salary > 5 lacs (eligible for income tax)
        return (input.equalsIgnoreCase("tax"))
                ? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000)
                .collect(Collectors.toList())
                : DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Employee> taxedEmployees = evaluateTaxUsers("tax");
        List<Employee> allEmployees = DataBase.getEmployees();
        //taxedEmployees.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
        //taxedEmployees.stream().sorted((emp1, emp2) -> emp1.getId() - emp2.getId()).forEach(System.out::println);
        taxedEmployees.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getSalary)).forEach(System.out::println);
        System.out.println("Salary sorted all Employees list below: ");
        allEmployees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

    }
}