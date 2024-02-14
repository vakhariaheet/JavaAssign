interface Computer {
    float PI = 3.14f;

    float compute(float x, float y);
}

class Calculator implements Computer {
    public float compute(float x, float y) {
        return PI * x * y;
    };

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Area of circle: " + c.compute(5, 5));
    }
}
