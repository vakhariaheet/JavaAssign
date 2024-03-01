// Create a object of string buffer class,which stores a string from the user. Perform the
// following operations.
// ● Reverse the string and print it.
// ● Take another string from the user and append it with existing string.
// ● Print the capacity of the modified string

import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("String: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Reverse: " + sb.reverse());
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        sb.append(str2);
        System.out.println("Modified String: " + sb);
        System.out.println("Capacity: " + sb.capacity());
    }
}