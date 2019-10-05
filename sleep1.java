public class sleep1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }
}

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // try {
            // Thread.sleep(10);
            // } catch (InterruptedException e) {
            // System.out.println(e);
            // }
            System.out.println(Thread.currentThread().getName());
        }
    }
}