import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        System.out.println(vec);
        vec.add(5);
        System.out.println(vec);
        vec.addElement(10);
        System.out.println(vec.capacity());
        // vec.removeElement(5);
        System.out.println(vec);
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());

    }    
}
