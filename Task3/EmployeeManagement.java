import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rakesh", 55000);
        Employee emp2 = new Employee(102, "Anil kumar", 60000);
        Employee emp3 = new Employee(103, "Vishal", 65000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println("Employee Details:");
        employeeList.forEach(Employee::displayDetails);
    }
}
