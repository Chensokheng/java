public class tr {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 50; i++) {
            println("i = " + i + ", i * i = " + i * i);
        }
    }

    public static void println(Object param) {
        System.out.println(param.toString());
    }

    public static void print(Object param) {
        System.out.print(param.toString());
    }
}

class MyThread extends Thread {
    public void run() {
        for (int count = 1, row = 1; row < 20; row++, count++) {
            for (int i = 0; i < countyc; i++) {
                print("*");
            }
            print("\n");
        }
    }

    public static void println(Object param) {
        System.out.println(param.toString());
    }

    public static void print(Object param) {
        System.out.print(param.toString());
    }
}