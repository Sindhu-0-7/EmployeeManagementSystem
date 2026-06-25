# Employee Management System

## Project Overview

The Employee Management System is a Java-based console application developed to manage employee records and salary information efficiently. This project demonstrates the implementation of Object-Oriented Programming concepts such as Abstraction, Inheritance, Polymorphism, Encapsulation, Sealed Classes, Records, and the Collections Framework.

The application allows users to add employees, display employee details, calculate salaries, search employees, remove employees, and generate basic employee statistics.

---

## Features

- Add Employee
- Display All Employees
- Calculate Employee Salary
- Search Employee by Employee ID
- Remove Employee by Employee ID
- Display Employees by Department
- Count Total Employees
- Calculate Total Salary Expense

---

## Employee Types

### Full-Time Employee
Salary is calculated based on a fixed monthly salary.

### Part-Time Employee
Salary is calculated using:

Salary = Hours Worked × Hourly Rate

### Contract Employee
Salary is calculated based on the contract amount assigned to the employee.

---

## Technologies Used

- Java 17
- Object-Oriented Programming (OOP)
- Collections Framework
- Records
- Enums
- Sealed Classes

---

## Project Structure


EmployeeManagementSystem
│
├── com.ems
│ ├── Employee.java
│ ├── FullTimeEmployee.java
│ ├── PartTimeEmployee.java
│ ├── ContractEmployee.java
│ ├── Address.java
│ └── Department.java
│
├── com.ems.service
│ └── EmployeeService.java
│
└── com.ems.main
└── EmployeeManagementApp.java
---

## Concepts Implemented

### Abstraction
The Employee class is declared as an abstract sealed class.

### Inheritance
FullTimeEmployee, PartTimeEmployee, and ContractEmployee inherit from Employee.

### Polymorphism
The calcSalary() method is overridden in each employee type to provide different salary calculations.

### Encapsulation
Employee details are maintained within classes and accessed through methods.

### Sealed Classes
The Employee class restricts inheritance to specific subclasses.

### Records
The Address record is used to store employee address details in an immutable format.

### Enums
The Department enum defines predefined departments.

---

## Sample Operations

1. Add Employee
2. Display Employee Details
3. Calculate Salary
4. Search Employee by ID
5. Remove Employee
6. Display Employees by Department
7. Calculate Total Salary Expense
8. Count Total Employees

---

## Sample Output

Employee ID : 100
Employee Name : Ramesh
Department : ADMIN
Salary : 5000.0

Employee ID : 200
Employee Name : Suresh
Department : HR
Salary : 2500.0

Employee Count : 3

Total Salary Expense : 27500.0

---

## Learning Outcomes

Through this project, I gained practical experience in:

- Java Object-Oriented Programming
- Class Design and Inheritance
- Method Overriding
- Collections Framework
- Java Records and Enums
- Sealed Classes in Java
- Building a Console-Based Management System

---

## Author

Sindhu Sakthivel

B.E. Computer Science and Engineering

Java Developer | Web Development Enthusiast
