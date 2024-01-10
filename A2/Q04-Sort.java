import java.util.Scanner;

/**
 * Q04
 */
class Q04Sort {
    void sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int ARR_LENGTH = 10;
        System.out.println("Enter 10 numbers");
        int arr[] =new int[ARR_LENGTH];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            arr[i] = scn.nextInt();
        Q04Sort inst = new Q04Sort();
        System.out.println("Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("After Sorting: ");
        inst.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        scn.close();
    }
    
}