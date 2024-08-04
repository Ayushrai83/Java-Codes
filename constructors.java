class MyMainEmployee{
    private int id;
    private String name;
//    public MyMainEmployee(){
//        id = 45;
//        name = "Your name here";
//    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        name = myName;
    }

    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public void setId(int i){this.id = i;}
    public int getId() {return id;}
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee ayush = new MyMainEmployee("Ayush",143);
        System.out.println(ayush.getId());
        System.out.println(ayush.getName());
    }
}

