import java.util.Scanner;

/**
 * Write a Java program to calculate gross salary and net salary of an employee.
 Gross salary = Hourly rate * total number of hours worked
 Net salary = gross salary - tax (7.5%)
    Take values from users using Scanner class
 */

class Q03Salary {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Hourly Rate: ");
        int hourlyRate = scn.nextInt();
        System.out.print("Enter Hours Worked: ");
        int hours = scn.nextInt();
        int grossSalary = hourlyRate * hours;
        double netSalary = grossSalary + (grossSalary * .075);

        System.out.println("Net Salary is " + netSalary);
    }

}