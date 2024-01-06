import java.util.ArrayList;
import java.util.Comparator;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        list.add(5);
        list.add(0, 10);
        System.out.println(list);
        System.out.println("Zeroth Element : " + list.get(0) + " ");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list.addAll(list2);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        if (list2.contains(3))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        // list2.containsAll(list)

        // list.remove(3);
        // list2.removeAll(list2)
        list2.add(3);
        list2.add(5);
        System.out.println(list2);
        System.out.println("Indexed of 3 in list2: " + list2.indexOf(3));
        System.out.println("Last Indexed of 3 in list2: " + list2.lastIndexOf(3));
        System.out.println(list2);
        if (list2.isEmpty())
            System.out.println("List is empty");
        else 
            System.out.println("List is not empty");
        System.out.println(list2);
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2);
    }    
}
