import java.util.Scanner;
import java.util.Stack;

class Q13Stack {
    int getMinimum(Stack<Integer> stk) {
        int minimum = stk.get(0);
        for (int i = 0; i < stk.size(); i++) {
            if (minimum > stk.get(i))
                minimum = stk.get(i);
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of the arr");
        int len = scn.nextInt();
        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            stk.push(scn.nextInt());
        }

        Q13Stack inst = new Q13Stack();
        System.out.println("Minimum Element of the Stack is " + inst.getMinimum(stk));

    }
    
}