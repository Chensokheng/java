import java.util.Scanner;

public class Daemon1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyThread t1 = new MyThread();

        // t1.setDaemon(true);
        t1.start();
        System.out.print("Enter your name :");
        String name = input.nextLine();
        System.out.println("This is your lucky number " + t1.num + name);
    }
}

class MyThread extends Thread {
    int num = 0;

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                num += i;
            }

        } else {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                num += i;
            }
        }
    }
}