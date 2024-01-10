import java.util.*;

class Duplicate {
    int[] removeDuplicate(int arr[]) {
        int temp[]=new int[arr.length];
        int count = 0;
        for (int num : arr) {
            if (indexOf(temp, num) == -1) {
                temp[count] = num;
                count++;
            } else
                continue;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return temp;
    }
    int indexOf(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i])
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of the arr");
        int len = scn.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            arr[i] = scn.nextInt();
        }
        Duplicate inst = new Duplicate();
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
        inst.removeDuplicate(arr);
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}