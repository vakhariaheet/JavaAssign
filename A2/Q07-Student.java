import java.util.Scanner;

class Student {
    String name;
    int phyicsMarks;

    public void getStudent() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scn.next();
        System.out.println("Enter your physics marks:");
        phyicsMarks = scn.nextInt();
    }

    public void printStudent() {
        System.out.println("Name:" + name);
        System.out.println("Marks:" +phyicsMarks);
;
    }
};

class Q07StudentMarks {
    public static void main(String[] args) {
        int length;
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter total no of Students");
        length = scn.nextInt();
        Student students[] = new Student[length];
        for(Student student : students)
            student.getStudent();
        for(Student student : students)
            student.printStudent();
    }
}



