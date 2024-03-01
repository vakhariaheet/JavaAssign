// Write a java program which contains the two string from user and perform the following
// string.
// ● Find out whether two strings are equal.
// ● Find out whether two strings equal when case is ignored.
// ● Compare two strings

import java.util.Scanner;

class StringCmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("Strings are equal when case is ignored.");
        } else {
            System.out.println("Strings are not equal when case is ignored.");
        }
        // Compare to will subtract the ASCII value of the first character of the first string from the first character of the second string
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}