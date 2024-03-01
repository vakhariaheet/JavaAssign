// Write a Java program to demonstrate Wrapping and UnWrapping in Classes.

import java.util.Scanner;

class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num = sc.nextInt();
        Integer i = Integer.valueOf(num);
        System.out.println("Number: " + i);
        
        int j = i.intValue();
        System.out.println("Unwrapped Number: " + j);
    }
}