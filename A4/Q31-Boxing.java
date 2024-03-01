// Write a Java program to demonstrate Boxing.

import java.util.Scanner;

class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num = sc.nextInt();
        Integer i = Integer.valueOf(num);
        System.out.println("Number: " + i);
    }
}