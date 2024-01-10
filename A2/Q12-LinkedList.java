import java.util.LinkedList;
import java.util.Scanner;

class Q12LinkedList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of the linkedList");
        int len = scn.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            linkedList.add(scn.nextInt());
        }

        System.out.println("Linked List: "+ linkedList);
    }
}