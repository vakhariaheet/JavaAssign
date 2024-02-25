import java.util.*;

class Duplicate {
    int[] removeDuplicate(int arr[]) {
        int temp[]=new int[arr.length];
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                temp[count] = arr[i];
                count++;
            }
        }
        temp[count] = arr[arr.length-1];
        return temp;
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
        arr = inst.removeDuplicate(arr);
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}