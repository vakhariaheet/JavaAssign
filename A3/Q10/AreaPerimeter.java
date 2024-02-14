import java.util.Scanner;

class Area {
    int length;
    int breath;
    int area;
    int calcAreaOfRectangle() {
        area = length * breath;
        return length * breath;
    }

    int calcAreaOfBox(int height) {
        area = 2 * (length * breath + breath * height + height * length);
        return 2 * (length * breath + breath * height + height * length);
    }
}

class Perimeter extends Area {
    int perimeter;

    Perimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        super.length = scanner.nextInt();
        System.out.print("Enter breath: ");
        super.breath = scanner.nextInt();
        scanner.close();
    }

    int calcPerimeterOfRectangle() {
        this.perimeter = 2 * (length + breath);
        return 2 * (length + breath);
    }

    int calcPerimeterOfBox(int height) {
        this.perimeter = 4 * (length + breath + height);
        return 4 * (length + breath + height);
    }
    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        System.out.println("Area of rectangle: " + p.calcAreaOfRectangle());
        System.out.println("Perimeter of rectangle: " + p.calcPerimeterOfRectangle());
        System.out.println("Area of box: " + p.calcAreaOfBox(5));
        System.out.println("Perimeter of box: " + p.calcPerimeterOfBox(5));
    }

}
