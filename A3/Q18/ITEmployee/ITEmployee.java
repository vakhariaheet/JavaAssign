package ITEmployee;

import java.util.Scanner;
import Employee.Employee;

public class ITEmployee extends Employee {
    private String technology;
    private int experience;

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getTechnology() {
        return technology;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ITEmployee itEmployee = new ITEmployee();
        System.out.print("Enter employee id: ");
        itEmployee.setEmpId(scanner.nextInt());
        System.out.print("Enter employee name: ");
        itEmployee.setEmpName(scanner.next());
        System.out.print("Enter employee address: ");
        itEmployee.setEmpAddress(scanner.next());
        System.out.print("Enter employee age: ");
        itEmployee.setEmpAge(scanner.nextInt());
        System.out.print("Enter technology: ");
        itEmployee.setTechnology(scanner.next());
        System.out.print("Enter experience: ");
        itEmployee.setExperience(scanner.nextInt());
        scanner.close();
        System.out.println("Employee id: " + itEmployee.getEmpId());
        System.out.println("Employee name: " + itEmployee.getEmpName());
        System.out.println("Employee address: " + itEmployee.getEmpAddress());
        System.out.println("Employee age: " + itEmployee.getEmpAge());
        System.out.println("Technology: " + itEmployee.getTechnology());
        System.out.println("Experience: " + itEmployee.getExperience());
    }
    
}
