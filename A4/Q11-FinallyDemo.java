import java.util.Scanner;

class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Enter two numbers");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            // If b is 0, then it will throw ArithmeticException automatically
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Finally block");
        }
    }
}