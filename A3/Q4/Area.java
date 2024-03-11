import java.util.Scanner;

interface AreaInterface {
    double areaOfCircle(double radius);

    double areaOfRectangle(double length, double breadth);

    double areaOfSquare(double side);
}

class Area implements AreaInterface {
    
    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public double areaOfSquare(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Area area = new Area();
        Scanner scanner = new Scanner(System.in);
        double radius, length, breadth, side;
        System.out.print("Enter radius of circle: ");
        radius = scanner.nextDouble();
        System.out.println("Area of circle: " + area.areaOfCircle(radius));
        System.out.print("Enter length of rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        breadth = scanner.nextDouble();
        System.out.println("Area of rectangle: " + area.areaOfRectangle(length, breadth));
        System.out.print("Enter side of square: ");
        side = scanner.nextDouble();
        System.out.println("Area of square: " + area.areaOfSquare(side));
        scanner.close();
    }
}



