import java.util.PriorityQueue;
import java.util.Queue;

import javax.security.auth.Subject;

class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<>(4);
        que.add(2);
        que.add(4);
        que.add(1);
        que.add(3);
        System.out.println(que);
        // System.out.println(que.peek());
        // System.out.println(que.poll());
        // System.out.println(que.poll());
        // System.out.println(que.poll());
        // System.out.println(que.poll());
        que.offer(0);
        for (int i = 0; i < 5; i++) {
            System.out.print(que.poll()+",");
        }
        System.out.println(que);
    }
}
