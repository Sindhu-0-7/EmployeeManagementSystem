package com.ems.service;

import java.util.ArrayList;
import java.util.List;

import com.ems.Department;
import com.ems.Employee;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display All Employees
    public void displayEmployees() {

        for (Employee emp : employees) {

            emp.displayBasicDetails();
            System.out.println("Salary : " + emp.calcSalary());
            System.out.println("------------------------");
        }
    }

    // Find Employee by ID
    public Employee findEmployeeById(int empId) {

        for (Employee emp : employees) {

            if (emp.getEmpId() == empId) {
                return emp;
            }
        }

        return null;
    }

    // Remove Employee by ID
    public boolean removeEmployee(int empId) {

        return employees.removeIf(emp ->
                emp.getEmpId() == empId);
    }

    // Total Salary Expense
    public double getTotalSalaryExpense() {

        double total = 0;

        for (Employee emp : employees) {
            total += emp.calcSalary();
        }

        return total;
    }

    // Employee Count
    public int getEmployeeCount() {
        return employees.size();
    }

    // Display Employees by Department
    public void displayEmployeesByDepartment(Department department) {

        for (Employee emp : employees) {

            if (emp.getDepartment() == department) {

                emp.displayBasicDetails();
                System.out.println("Salary : " + emp.calcSalary());
                System.out.println("------------------------");
            }
        }
    }
}