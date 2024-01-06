import java.util.Scanner;

/**
 Write a Java Program that will accept a number from the user and calculate
its square and cube and display the same.
 */

class Q04Square {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        int square = num * num;
        int cube = num * num * num;
        System.out.println("Square of " + num + " is " + square);
        System.out.println("Cube of " + num + " is " + cube);
    }
}