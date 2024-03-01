
class PrintHello implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}
class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new PrintHello());
        t.start();
    }
}