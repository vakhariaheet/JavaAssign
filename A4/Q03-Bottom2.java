import java.util.Scanner;

class Bottom2 {
    public static void main(String[] args) {
        int SIZE;
        System.out.println("Enter the size of the array");
        Scanner scn = new Scanner(System.in);
        SIZE = scn.nextInt();
        try {
            if(SIZE < 3){
                throw new ArrayIndexOutOfBoundsException("Array size is too small");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return;
        }
        int[] arr = new int[SIZE];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < SIZE; i++)
            arr[i] = scn.nextInt();
        int lowest = arr[0], secondLowest = arr[0];
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] < lowest) {
                secondLowest = lowest;
                lowest = arr[i];
            } else if (arr[i] < secondLowest && arr[i] != lowest) {
                secondLowest = arr[i];
            }
        }
        System.out.println("Lowest: " + lowest + " Second Lowest: " + secondLowest);
        scn.close();
    }
}