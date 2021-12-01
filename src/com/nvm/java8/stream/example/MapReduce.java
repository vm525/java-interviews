package com.nvm.java8.stream.example;

import java.util.List;

public class MapReduce {
    public static void main(String[] args) {
        List<Employee> employees = DataBase.getEmployees();
        long salaryMax = employees.stream()
                .map(Employee::getSalary)
                .reduce(Long.MIN_VALUE, Long::max);

        System.out.println(salaryMax);
    }
}
