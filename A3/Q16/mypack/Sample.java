package mypack;

import MyPackage.Student;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter roll number: ");
        student.setRollNo(scanner.nextInt());
        System.out.print("Enter first name: ");
        student.setFirstName(scanner.next());
        System.out.print("Enter middle name: ");
        student.setMiddleName(scanner.next());
        System.out.print("Enter last name: ");
        student.setLastName(scanner.next());
        System.out.print("Enter address: ");
        student.setAddress(scanner.next());
        System.out.print("Enter age: ");
        student.setAge(scanner.nextInt());
        scanner.close();
        System.out.println("Roll number: " + student.getRollNo());
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Middle name: " + student.getMiddleName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Age: " + student.getAge());
    }
}
