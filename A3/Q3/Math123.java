
import java.util.Scanner;
class Mean {
    int numbers[] = new int[10];

    void takeNumbers() {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scn.nextInt();
        }
    }

    int calculateMean() {
        int sum = 0;
        for (int num : numbers)
            sum += num;
        return sum / numbers.length;
    }
}
class Deviation extends Mean {
    int mean;
    int deviation;
    Deviation() {
        takeNumbers();
        mean = calculateMean();
        deviation = 0;
        for (int num : numbers)
            deviation += Math.pow(num - mean, 2);
        deviation = (int) Math.sqrt(deviation / numbers.length);
    }
    void display() {
        System.out.println("Mean: " + mean);
        System.out.println("Deviation: " + deviation);
    }
    public static void main(String[] args) {
        Deviation dev = new Deviation();
        dev.display();
    }
}