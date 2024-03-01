// Write a Java program to do following operations on String.
// 1. To find the reverse of a string
// 2. To replace string
// 3. To convert into upper case
// 4.Conver the uppercase string to lowercase.

import java.util.Scanner;


class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        // To find the reverse of a string we can use StringBuffer's reverse method
        StringBuffer sb = new StringBuffer(str);
        System.out.println("String: " + sb);
        System.out.println("Reverse: " + sb.reverse());
        System.out.println("Enter a string to replace: ");
        String str2 = sc.nextLine();
        System.out.println("Enter a string to replace with: ");
        String str3 = sc.nextLine();
        System.out.println("Replaced: " + str.replace(str2, str3));
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
    }
}