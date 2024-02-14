import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calcArea() {
        return length * breadth;
    }

    int calcPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }

    public static void main(String[] args) {
        int side;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        side = scanner.nextInt();
        Square s = new Square(side);
        System.out.println("Area of square: " + s.calcArea());
        System.out.println("Perimeter of square: " + s.calcPerimeter());
        int length, breadth;
        System.out.print("Enter length of rectangle: ");
        length = scanner.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = scanner.nextInt();
        scanner.close();
        Rectangle r = new Rectangle(length, breadth);
        System.out.println("Area of rectangle: " + r.calcArea());
        System.out.println("Perimeter of rectangle: " + r.calcPerimeter());

    }

}
