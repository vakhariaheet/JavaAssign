import javax.swing.JOptionPane;

class OddException extends Exception {
    public OddException(String message) {
        super(message);
    }
}

class EvenCheck {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        }
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddCount++;
            }
        }
        try {
            if (oddCount > 0) {
                throw new OddException("There are " + oddCount + " odd numbers in the array");
            }
            for (int num : arr) {
                System.out.println(num);
            }
        } catch (OddException e) {
            System.out.println(e.getMessage());
        }
        
    }
}