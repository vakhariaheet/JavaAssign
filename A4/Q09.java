// ! DOUBTFUL
class ThreadsDemo {
    public static void main(String[] args) {
        Thread t = new Thread("Hello");
        t.start();
        Thread t1 = new Thread(" World");
        t1.start();
        System.out.println(t.getName());
        System.out.println(t1.getName());
    }
}