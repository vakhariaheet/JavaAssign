package A3.Q8;

interface AreaInterface {
    double areaOfCircle(double radius);

    double areaOfRectangle(double length, double breadth);

    double areaOfSquare(double side);
}

interface VolumeInterface {
    double volumeOfCylinder(double radius, double height);

    double volumeOfCube(double side);
}

public class MultipleInheirtance implements AreaInterface, VolumeInterface {

    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public double areaOfSquare(double side) {
        return side * side;
    }

    public double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public double volumeOfCube(double side) {
        return side * side * side;
    }

    public static void main(String[] args) {
        MultipleInheirtance mi = new MultipleInheirtance();
        System.out.println("Area of circle: " + mi.areaOfCircle(5));
        System.out.println("Area of rectangle: " + mi.areaOfRectangle(5, 10));
        System.out.println("Area of square: " + mi.areaOfSquare(5));
        System.out.println("Volume of cylinder: " + mi.volumeOfCylinder(5, 10));
        System.out.println("Volume of cube: " + mi.volumeOfCube(5));
    }
}
