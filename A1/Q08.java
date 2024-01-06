import java.util.Scanner;

class PrimeNumber {
    PrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a Prime Number");
                return;
            }
        }
        System.out.println(num + " is a Prime Number");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        PrimeNumber inst = new PrimeNumber(num);
    }
}