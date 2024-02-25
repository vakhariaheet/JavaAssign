import java.util.*;
import javax.swing.*;

class Intro {
    
    int add(int a , int b) {
        return a + b;
    }

    Intro() {
        System.out.println("Instance Created");
    }
    Intro(int a ,int b) {
        System.out.println("A: "+a + " B: "+b);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scn = new Scanner(System.in);
        String numStr = JOptionPane.showInputDialog(null, "Enter a number","Number Input",JOptionPane.ERROR_MESSAGE);
        // int num = Integer.parseInt(numStr);
        int num = scn.nextInt();
        int num1 = scn.nextInt();
        Intro inst = new Intro();

        // System.out.println("You entered " + (num + 1));
        JOptionPane.showMessageDialog(null, "Sum is " + inst.add(num, num1), "Number Popup", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Sum is " + add(num, num1), "Number Popup", JOptionPane.INFORMATION_MESSAGE);


        
    }
}
