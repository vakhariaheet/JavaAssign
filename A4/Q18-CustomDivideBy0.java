// Write a program in Java to develop user defined exception for 'Divide by Zero' error.

import java.util.Scanner;

class DivideByZeroException extends Exception {
    DivideByZeroException(String message) {
        super(message);
    }
}

class Q18 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter two numbers");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                throw new DivideByZeroException("Divide by zero error");
            }
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}