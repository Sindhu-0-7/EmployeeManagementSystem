package com.ems.Main;
import com.ems.Address;
import com.ems.service.EmployeeService;
import com.ems.Employee;
import com.ems.FullTimeEmployee;
import com.ems.PartTimeEmployee;
import com.ems.ContractEmployee;
import com.ems.Department;
public class EmployeeManagementApp {

	public static void main(String[] args) {
		





        EmployeeService service = new EmployeeService();

        Address a1 = new Address("Erode", "TN", "632122");

        Employee e1 = new FullTimeEmployee(
                100, "Ramesh",
                Department.ADMIN,
                a1,
                5000);

        Employee e2 = new PartTimeEmployee(
                200, "Suresh",
                Department.HR,
                a1,
                5,
                500);

        Employee e3 = new ContractEmployee(
                300, "James",
                Department.SALES,
                a1,
                20000);

        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);
        System.out.println("===== ALL EMPLOYEES =====");
        service.displayEmployees();

        System.out.println("\nEmployee Count : "
                + service.getEmployeeCount());

        System.out.println("\nTotal Salary Expense : "
                + service.getTotalSalaryExpense());

        System.out.println("\n===== HR EMPLOYEES =====");
        service.displayEmployeesByDepartment(Department.HR);

        Employee foundEmployee = service.findEmployeeById(100);

        if (foundEmployee != null) {
            System.out.println("\nEmployee Found:");
            foundEmployee.displayBasicDetails();
        }
        System.out.println("\nRemoving Employee with ID 200...");

        if (service.removeEmployee(200)) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\n===== EMPLOYEES AFTER REMOVAL =====");
        service.displayEmployees();
    }
}