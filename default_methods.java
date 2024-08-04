interface Mycamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning"); //it can not be used directly
    }
    default void recordVideo4k(){
        greet();
        System.out.println("Recording in 4k....");
    }
}
interface Mywifi{
    String[] getnetworks();
    void connectToNetworks(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling a number "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements Mywifi, Mycamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video....");
    }
    public void recordVideo4k(){
        System.out.println("Taking snap  and Recording in 4k....");
    }
    public String[] getnetworks(){
        System.out.println("Getting list of networks");
        String [] networkList = {"Ayush","IPhone","Savita","Shubham","Rohan"};
        return networkList;
    }
    public void connectToNetworks(String  networks){
        System.out.println("Connecting to "+ networks );
    }
}
public class default_methods {
    public static void main(String[] args) {
        MySmartPhone  ms = new MySmartPhone();
        ms.recordVideo4k();
        String[] ar = ms.getnetworks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}
