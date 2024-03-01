//Write a java program to handle ArrayIndexOutOfBoundsException

import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        try {
            System.out.println("Enter the index you want to access: ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
    }
}