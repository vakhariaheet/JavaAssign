import java.util.Scanner;

import javax.swing.JOptionPane;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

class InternetCheck {
    public static void main(String[] args) {
        try {
            String str = JOptionPane.showInputDialog("Enter a string");
            
            if (!str.equals("internet")) { 
                throw new NoMatchException("The string is not 'internet'");
            }
            System.out.println("The string is 'internet'");
        }
        catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }

    }
}