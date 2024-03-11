import java.util.Timer;
import java.util.TimerTask;

class MyThread1 extends Thread {
    int duration;

    MyThread1(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    public void run() {
        Timer tim = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(getName());
            }
        };
        tim.schedule(task, 0, duration);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hellooooooooooooooo");
    }
}

class Demo {
    public static void main(String[] args) {
        // MyThread1 t = new MyThread1("Thread 1", 2000);
        // MyThread1 t2 = new MyThread1("Thread 2", 4000);
        // t.start();
        // t2.start();
        // String name = "Helooooo";
        // name.length();
        // name.charAt(0);
        // name.indexOf('a');
        // name.substring(3, 5);
        // name.toLowerCase();
        // name.toUpperCase();
        // name.equals("name");
        // name.equalsIgnoreCase("name");
        // name.trim();
        // name.replace("name", "dfsaf");
        // StringBuffer nameBuffer = new StringBuffer(name);
        // nameBuffer.reverse();
        // nameBuffer.capacity();
        // nameBuffer.length();

    }
}


