package SciCalc;

import Calc.Calculator;


public class SciCalculator extends Calculator {
    public SciCalculator(int num1, int num2) {
        super(num1, num2);
    }

    public int sqrt() {
        return (int) Math.sqrt(num1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        Calculator c = new Calculator(num1, num2);
        System.out.println("Addition: " + c.add());
        System.out.println("Subtraction: " + c.subtract());
        SciCalculator sc = new SciCalculator(num1, num2);
        System.out.println("Square root: " + sc.sqrt());

    }
}
