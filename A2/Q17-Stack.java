import java.util.*;

class Q17Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a length of the stack");
        int len = scn.nextInt();

        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            stack.push(scn.nextInt());
        }

        System.out.println("Stack: " + stack);

        // peep
        System.out.println("Peep: " + stack.peek());

        // pop
        System.out.println("Pop: " + stack.pop());

        // search
        System.out.println("Enter element you want to search: ");
        int ele = scn.nextInt();
        int idx = stack.search(ele);
        if (idx == -1)
            System.out.println("Element not Found");
        else System.out.println("Element found at index :" + idx);
    }

}