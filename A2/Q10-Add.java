import java.util.Scanner;

class Q10Add {
    int add(int... numbers) {
        int sum = 0;
        for (int num : numbers)
            sum += num;
        return sum;
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
        Q10Add inst = new Q10Add();
        int sum = inst.add(arr);
        System.out.println("Sum is " + sum);
    }
}

