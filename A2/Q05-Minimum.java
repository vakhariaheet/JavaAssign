import java.util.Scanner;

class Q05Minimum {
    int getMinimum(int arr[][]) {
        int minimum = arr[0][0];
        
        for (int row[] : arr)
            for (int num : row) 
                if (minimum > num) 
                    minimum = num;

        return minimum;
    }
    public static void main(String[] args) {
        int rows, cols;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        rows = scn.nextInt();
        cols = scn.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter " + rows*cols+" elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        Q05Minimum inst = new Q05Minimum();

        int minimum = inst.getMinimum(arr);

        System.out.println("Minimum number in the arr is "+minimum);
    }
}