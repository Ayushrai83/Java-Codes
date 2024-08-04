class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class access_modifier {
    public static void main(String[] args) {
        MyEmployee ayush = new MyEmployee();
        // ayush.id = 45;
        // ayush.name = "Ayush"; --> Throws an error due to private access modifier
        ayush.setName("Ayush");
        System.out.println(ayush.getName());
        ayush.setId(234);
        System.out.println(ayush.getId());
    }
}

