import java.util.*;

class Q18Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a length of the queue");
        int len = scn.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            queue.add(scn.nextInt());
        }

        System.out.println("Queue: " + queue);

        //Peek
        System.out.println("Peek: " + queue.peek());
        // poll
        System.out.println("Poll: " + queue.poll());
        // contains
        System.out.println("Enter a number to check if it is in the queue");
        int containsNum = scn.nextInt();
        System.out.println("Queue contains " + containsNum + " : " + queue.contains(containsNum));
    }
}