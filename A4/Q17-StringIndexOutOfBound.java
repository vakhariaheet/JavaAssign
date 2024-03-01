// Write a java program to handle StringIndexOutOfBoundsException

import java.util.Scanner;

class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        try {
            System.out.println("Enter the index you want to access: ");
            int index = sc.nextInt();
            System.out.println("Character at index " + index + " is: " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}