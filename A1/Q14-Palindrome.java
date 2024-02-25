import java.util.Scanner;

class Q14Palindrome {
    static boolean isPalidrome(int num) {
        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return num == reverse;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if (isPalidrome(num)) {
            System.out.println(num + " is Palindrome");
        }
        else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}