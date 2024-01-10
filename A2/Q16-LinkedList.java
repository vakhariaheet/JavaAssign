import java.util.*;

class Q16LinkedList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of the linkedList");
        int len = scn.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            linkedList.add(scn.nextInt());
        }

        System.out.println("Linked List: " + linkedList);
        
        // addAll method
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        System.out.println("Enter a length of the linkedList");
        int len2 = scn.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len2; i++) {
            linkedList2.add(scn.nextInt());
        }
        linkedList.addAll(linkedList2);
        System.out.println("Linked List: " + linkedList);

        // addFirst method
        System.out.println("Enter a number to add at the beginning of the linkedList");
        int addFirstNum = scn.nextInt();
        linkedList.addFirst(addFirstNum);
        System.out.println("Linked List: " + linkedList);

        // get method
        System.out.println("Enter a number to get index of: ");
        int getIdx = scn.nextInt();
        System.out.println("Index of " + getIdx + " is " + linkedList.get(getIdx));

        // getLastIndexOf method
        System.out.println("Enter a number to get last index of: ");
        int getLastIdx = scn.nextInt();
        System.out.println("Last Index of " + getLastIdx + " is " + linkedList.lastIndexOf(getLastIdx));
    }
}