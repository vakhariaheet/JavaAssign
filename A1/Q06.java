import javax.swing.JOptionPane;

class LeapYear {
    public static void main(String[] args) {
        String yearStr = JOptionPane.showInputDialog(null, "Enter a year", "Year Input", JOptionPane.QUESTION_MESSAGE);
        int year = Integer.parseInt(yearStr);
        if (year % 4 == 0) {
            if (year % 100 != 0)
                System.out.println(year + " is Leap Year");
            else if (year % 400 == 0)
                 System.out.println(year + " is Leap Year");
            else 
                 System.out.println(year + " is not Leap Year");
        }
        else
         System.out.println(year + " is not Leap Year");
    }
}