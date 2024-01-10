import java.util.Scanner;

/**
 * Q04
 */
class Q08SortDesc {
    void sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length;
        System.out.println("Enter Array length:");
        length = scn.nextInt();
        System.out.println("Enter 10 numbers");
        int arr[] =new int[length];
        for (int i = 0; i < 10; i++)
            arr[i] = scn.nextInt();
        Q08SortDesc inst = new Q08SortDesc();
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