import java.util.Scanner;

class Q06Diagonal {
    int getDiagonalsSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j || i+j == arr.length-1)
                    sum += arr[i][j];
            }
        }
        
        return sum;
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

        Q06Diagonal inst = new Q06Diagonal();

        int sum = inst.getDiagonalsSum(arr);

        System.out.println("Sum of Primary and Secondary Diagonal elements is "+sum);
    }
}