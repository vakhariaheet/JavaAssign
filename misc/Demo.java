import java.util.Scanner;

class Student {
    String name = "";

    public void input() {
        Scanner scn = new Scanner(System.in);
        name = scn.next();
    }

    public void display() {
        System.out.println(name);
    }
}

class Demo {
   public static void main(String[] args) {
     Student s1 = new Student();
     Student s2 = new Student();
     s1.input();
     s2.display();
   }
}
