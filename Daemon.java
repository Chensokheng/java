public class Daemon {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        if (args.length == 0) {
            mt.start();
        } else {
            mt.setDaemon(true);
            mt.start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("Hello world");
        System.out.println(mt.i);
    }
}

class MyThread extends Thread {
    int i = 0;

    public void run() {
        System.out.println("Daemon is " + isDaemon());
        while (true)
            i = i + 1;
    }
}