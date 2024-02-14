

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
        System.out.println("Area of circle: " + area.areaOfCircle(5));
        System.out.println("Area of rectangle: " + area.areaOfRectangle(5, 10));
        System.out.println("Area of square: " + area.areaOfSquare(5));
    }
}



