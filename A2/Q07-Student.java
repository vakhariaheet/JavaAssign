import java.util.Scanner;
class Q07Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter marks of students:");
        int i = 0;
        for(int mark:arr){
            arr[i++] = sc.nextInt();
        }
        System.out.println("The marks of students are: ");
       
        for (int mark : arr) {
            System.out.println(mark);
        }

    }
}



