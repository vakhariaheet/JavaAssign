// Write a java program using Wrapper class. 

import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Integer i = Integer.valueOf(num);
        System.out.println("Number: " + i);
    }
}