import java.util.Iterator;
import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(34);
        list.add(3);
        list.add(324);
        list.add(334);
        Iterator<Integer> itr = list.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
