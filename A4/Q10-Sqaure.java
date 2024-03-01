import java.util.Scanner;

class RangeOutOfBoundsException extends Exception {
    public RangeOutOfBoundsException(String message) {
        super(message);
    }
}

class RangeCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        try {
            if (num < 0 || num > 100) {
                throw new RangeOutOfBoundsException("The number is out of range");
            }
            System.out.println("Square of " + num + " is " + num * num);
        } catch (RangeOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}