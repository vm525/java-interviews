package com.nvm.java8.stream.example;

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
        System.out.println(evaluateTaxUsers("tax"));
    }
}