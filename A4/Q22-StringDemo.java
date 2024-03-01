// Write a java program which shows String class methods. 

import java.util.Scanner;

class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring from index 2 to 5: " + str.substring(2, 5));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Index of 'a' after index 3: " + str.indexOf('a', 3));
        System.out.println("Index of 'ab': " + str.indexOf("ab"));
        System.out.println("Index of 'ab' after index 3: " + str.indexOf("ab", 3));
        System.out.println("Concatenation with 'xyz': " + str.concat("xyz"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trim: " + str.trim());
        System.out.println("Replace 'a' with 'x': " + str.replace('a', 'x'));
        System.out.println("Replace 'ab' with 'xy': " + str.replace("ab", "xy"));
        System.out.println("Starts with 'a': " + str.startsWith("a"));
        System.out.println("Ends with 'a': " + str.endsWith("a"));
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Is equal to 'abc': " + str.equals("abc"));
        System.out.println("Is equal to 'abc' ignoring case: " + str.equalsIgnoreCase("abc"));
    }
}