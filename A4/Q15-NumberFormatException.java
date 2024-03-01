// 15 Write a java program to handle NumberFormatException.
import java.util.Scanner;
class Q15 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            String str = sc.next();
            int num = Integer.parseInt(str);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
}