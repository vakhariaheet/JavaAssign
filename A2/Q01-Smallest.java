import java.util.Scanner;

class SmallestNumber {

    int getSmallestNumber(int arr[]) {
        int smallest = arr[0];
        for (int num : arr) {
            if (smallest > num)
                smallest = num;
        }
        return smallest;
    }
    public static void main(String args[]) {
        int[] arr = new int[10];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        SmallestNumber inst = new SmallestNumber();
        int smallest = inst.getSmallestNumber(arr);
        System.out.println("Smallest number in the arr is " + smallest);
        scn.close();
    }
}