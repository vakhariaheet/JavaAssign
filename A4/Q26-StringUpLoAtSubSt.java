// Consider string s=”FCAIT GLS University”, modify the string s as
// ● Convert the string into uppercase and lowercase
// ● Find out the character at position 5.
// ● Find out the sub string as GLS University

import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at position 5: " + str.charAt(5));
        System.out.println("Substring from position 5: " + str.substring(5));
    }
}