public class name {
    public static void main(String[] args) {
        MyThread mt;
        if (args.length == 0) {
            mt = new MyThread();
        } else {
            mt = new MyThread(args[0]);
        }
        mt.start();
    }

    public static void println(Object param) {
        System.out.println(param.toString());
    }

    public static void print(Object param) {
        System.out.print(param.toString());
    }

}

class MyThread extends Thread {
    MyThread() {

    }

    MyThread(String name) {
        super(name);
    }

    public void run() {
        println("My name is :" + getName());
    }

    public static void println(Object param) {
        System.out.println(param.toString());
    }

    public static void print(Object param) {
        System.out.print(param.toString());
    }
}