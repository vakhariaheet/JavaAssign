import java.util.Scanner;

class MotorVehicle {
    String modelName;
    int modelNumber;
    float modelPrice;

    void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice);
    }
}

class Car extends MotorVehicle {
    int discountRate;
    Car() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Model Name: ");
        modelName = scn.nextLine();
        System.out.println("Enter Model Number: ");
        modelNumber = scn.nextInt();
        System.out.println("Enter Model Price: ");
        modelPrice = scn.nextFloat();
        System.out.println("Enter Discount Rate: ");
        discountRate = scn.nextInt();
    }
    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate);
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}


