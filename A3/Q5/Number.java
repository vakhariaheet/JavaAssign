

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
        Sum sum = new Sum();
        System.out.println("Sum: " + sum.process(5, 10));
        Average avg = new Average();
        System.out.println("Average: " + avg.process(5, 10));
    }
}
