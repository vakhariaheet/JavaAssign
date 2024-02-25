import java.util.Scanner;

class Q10FeetToCenti {
    public double ft = 0;

    Q10FeetToCenti() {
        System.out.println("Constructor");
    };

    Q10FeetToCenti(Q10FeetToCenti inst) {
    
        double cm = inst.ft * 30.48;
        System.out.println("in CM is " + cm);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter Feets:");
        Scanner scn = new Scanner(System.in);
        Q10FeetToCenti inst = new Q10FeetToCenti();
        inst.ft = scn.nextFloat();
        Q10FeetToCenti inst2 = new Q10FeetToCenti(inst);

    }
}