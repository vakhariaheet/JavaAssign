import java.util.*;

/**
 * This class represents a custom thread, Thread1.
 * It extends the Thread class and prints "Thread 1" every 2 seconds using a TimerTask.
 */
class Thread1 extends Thread {
    /**
     * The run method is called when the thread starts.
     * It creates a Timer and schedules a TimerTask to print "Thread 1" every 2 seconds.
     */
    public void run() {
        // Create a Timer object to schedule the TimerTask
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Thread 1");
            }
        };

        timer.schedule(task, 0, 2000);
    }
}

class Thread2 extends Thread {
    public void run() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Thread 2");
            }
        };
        timer.schedule(task, 0, 4000);
    }
}
class TwoThreads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        
    }
}