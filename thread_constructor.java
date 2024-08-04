class MyStr extends Thread{
    public MyStr(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("thank you!");
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyStr t1 = new MyStr("Ayush");
        MyStr t2 = new MyStr("Savita");
        t1.start();
        t2.start();
        System.out.println( "The id of the first thread is  " + t1.getId());
        System.out.println( "The name of the first thread is  " + t1.getName());
        System.out.println( "The id of the second thread is  " + t2.getId());
        System.out.println( "The name of the second thread is  " + t2.getName());

    }
}
