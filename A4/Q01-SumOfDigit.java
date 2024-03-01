import java.util.Scanner;
import java.io.*;

class SumOfDigit {

   
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 1000");
        int num = scn.nextInt();
        try {
            if (num < 1 || num > 1000) {
                throw new ArithmeticException("Number is not in Range");
            }
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            System.out.println("Sum of " + num + " is " + sum );
        } catch (ArithmeticException err) {
            System.out.println(err.getMessage());
        }
    }
}