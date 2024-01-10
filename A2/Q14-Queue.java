import java.util.*;



class Q14Queue {
    int getMinimum(PriorityQueue<Integer> queue) {
        Iterator<Integer> itr = queue.iterator();
        int minimum = itr.next();
        while (itr.hasNext()) {
            int num = itr.next();
            if(minimum > num){
                minimum = num;
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of the arr");
        int len = scn.nextInt();
        PriorityQueue<Integer> stk = new PriorityQueue<Integer>();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            stk.add(scn.nextInt());
        }

        Q14Queue inst = new Q14Queue();
        System.out.println("Minimum Element of the Queue is " + inst.getMinimum(stk));

    }
    
}