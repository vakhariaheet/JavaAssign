import java.util.Scanner;

interface Number {
    public int process(int a, int b);
}


class Sum implements Number {
    public int process(int a, int b) {
        return a + b;
    }
}

class Average implements Number {
    public int process(int a, int b) {
        return (a + b) / 2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        Sum sum = new Sum();
        System.out.println("Sum: " + sum.process(a,b));
        Average avg = new Average();
        System.out.println("Average: " + avg.process(a,b));
    }
}
