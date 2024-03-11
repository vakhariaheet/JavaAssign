class MyThread extends Thread {

    public int sum = 0, avg = 0, start, end;

    MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++)
            sum += i;
        avg = sum / end - start;
    }
}

public class Q10Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(1, 5);
        MyThread t2 = new MyThread(6, 10);
        MyThread t3 = new MyThread(11, 15);
        t1.start();
        t2.start();
        t3.start();
    }
}


