class MyStr1 extends Thread {
    public MyStr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("thank you! " + getName());
        }
    }
}
public class Java_thread_priorities {
    public static void main(String[] args) {
        MyStr1 t1 = new MyStr1("Ayush");
        MyStr1 t2 = new MyStr1("Savita (Most important)");
        MyStr1 t3 = new MyStr1("Shubham");
        MyStr1 t4 = new MyStr1("Anshika");
        MyStr1 t5 = new MyStr1("Tamana");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t2.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
    }
}





