import java.util.*;

class Q09Search {
    int search(int arr[], int val) {
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
        Q09Search inst = new Q09Search();
        System.out.println("Enter element you want to search: ");
        int ele = scn.nextInt();
        int idx = inst.search(arr, ele);
        if (ele == -1)
            System.out.println("Element not Found");
        else System.out.println("Element found at index :" + idx);
    }
}