public class synchro {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread t1 = new MyThread(t, 5);
        MyThread t2 = new MyThread(t, 11);

        t1.start();
        t2.start();
    }
}

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    private Table t;
    int n = 0;

    MyThread(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }

}