public class tr1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");

        t1.start();
        // try {
        // t1.join();
        // } catch (InterruptedException e) {

        // }
        t2.start();
    }
}

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}