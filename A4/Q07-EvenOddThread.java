
// Write a program to create two threads. One thread should print odd numbers from 1 to 100 and the other thread should print even numbers from 1 to 100.

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i += 2)
            System.out.println("Odd: " + i);
    }
}

class EvenThread extends Thread {
    public void run() {

        for (int i = 2; i <= 50; i += 2)
            System.out.println("Even: " + i);
    }
}

class OddEvenThread {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        even.start();
    }
}