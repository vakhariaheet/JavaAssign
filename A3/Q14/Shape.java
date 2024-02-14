package A3.Q14;

class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }    
}

class Circle extends Shape {
    void displayCircle() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    void displayRectangle() {
        System.out.println("This is a rectangle");
    }
}

class Square extends Rectangle {
    void displaySquare() {
        System.out.println("Square is a rectangle");
    }
    public static void main(String[] args) {
        Square s = new Square();
        s.displayShape();
        s.displayRectangle();
        s.displaySquare();
    }
}