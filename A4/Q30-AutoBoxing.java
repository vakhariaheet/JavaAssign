// Write a Java program to demonstrate Autoboxing.

import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num = sc.nextInt();
        Integer i = num;
        System.out.println("Number: " + i);
    }
}