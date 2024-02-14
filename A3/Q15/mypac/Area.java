package mypac;

import java.util.Scanner;

public class Area {
    int length;
    int breath;

    Area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextInt();
        System.out.print("Enter breath: ");
        breath = scanner.nextInt();
        scanner.close();
    }
    public int calcAreaOfRectangle() {
        return length * breath;
    }
}
