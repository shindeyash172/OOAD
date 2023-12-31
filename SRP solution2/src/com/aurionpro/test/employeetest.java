package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SalarySlipPrinter;
import com.aurionpro.model.annualtax;

import java.util.ArrayList;
import java.util.List;

public class employeetest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        Employee employee1 = new Employee(1, "yash", 100000, 20, 10, 15);
        Employee employee2 = new Employee(2, "akash", 100000, 25, 12, 18);
        employees.add(employee1);
        employees.add(employee2);
        
        for (Employee employee : employees) {
            SalarySlipPrinter.printSalarySlip(employee);
            double annualTax = annualtax.calculateAnnualTax(employee);
            System.out.println("Annual Tax: " + annualTax);
        }
    }
}
