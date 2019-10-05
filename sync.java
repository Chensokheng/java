import java.util.*;

public class sync {
    public static void main(String[] args) {
        FinTran ft = new FinTran();

        MyThread t1 = new MyThread(ft, "Deposit Thread");
        MyThread t2 = new MyThread(ft, "Withdrawal Thread");
        t1.start();

        t2.start();
    }
}

class FinTran {
    public String tranNames;
    public double amount;
}

class MyThread extends Thread {
    private FinTran ft;

    public MyThread(FinTran ft, String name) {
        super(name);
        this.ft = ft;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            if (getName().equals("Deposit Thread")) {
                synchronized (ft) {
                    ft.tranNames = "Deposit";
                    try {
                        Thread.sleep((int) (Math.random() * 100));
                    } catch (InterruptedException e) {
                    }
                    ft.amount = 2000.0;
                    System.out.println(ft.tranNames + " " + ft.amount + " ====>" + getName());
                }
            } else {
                synchronized (ft) {
                    ft.tranNames = "WithDrawl";
                    try {
                        Thread.sleep((int) (Math.random() * 100));
                    } catch (InterruptedException e) {
                    }
                    ft.amount = 250.0;
                    System.out.println(ft.tranNames + " " + ft.amount + " ====>" + getName());
                }

            }
        }
    }
}