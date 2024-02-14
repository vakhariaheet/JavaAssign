package A3.Q9;

class Parent {
    void displayParent() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.displayChild();
        Parent p = new Parent();
        p.displayParent();
        c.displayParent();
    }
}