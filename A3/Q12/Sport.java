import java.util.Scanner;

//TODO Ask Mam about the sports weight
interface Sports {
    float sportWt = 6.0f;

    void displaySportWt();
}

class Result implements Sports {
    int total;
    int subjects[] = new int[3];
    float percentage;

    Result() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        subjects[0] = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        subjects[1] = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        subjects[2] = scanner.nextInt();
        scanner.close();
        for (int mark : subjects)
            total += mark;

    }

    public void displaySportWt() {
        System.out.println("Sports weight: " + sportWt);
    }

    void displayResult() {
        percentage = total + sportWt / 3;
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.displaySportWt();
        r.displayResult();
    }
}
