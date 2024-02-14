import java.util.Scanner;

class Employee {
    String name;
    String designation;
}

class EmployeeWithSalary extends Employee {
    float salary;
    EmployeeWithSalary() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scn.nextLine();
        System.out.print("Enter Designation: ");
        designation = scn.nextLine();
        System.out.print("Enter Salary: ");
        salary = scn.nextFloat();
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        EmployeeWithSalary emp = new EmployeeWithSalary();
        emp.display();
    }
}