import java.util.Scanner;

class Admin {
    int id;
    String name;
    int enrollmentNo;

    public void get() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Id:");
        id = scn.nextInt();
        System.out.println("Enter your name:");
        name = scn.next();
        System.out.println("Enter your enrollment no:");
        enrollmentNo = scn.nextInt();
    }

    public void display() {
        System.out.println("Id:" +id);
        System.out.println("Name:" + name);
        System.out.println("Enrollment No:"+enrollmentNo);
    }
};

class Q11Admin {
    public static void main(String[] args) {
        int length;
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter total no of Students");
        length = scn.nextInt();
        Admin admins[] = new Admin[length];
        for(Admin admin : admins)
            admin.get();
        for(Admin admin : admins)
            admin.display();
    }
}



