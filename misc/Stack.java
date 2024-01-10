import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(5);
        stk.push(10);
        stk.push(15);
        System.out.println(stk.empty());
        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk);
        System.out.println(stk.search(10));
    }
}
