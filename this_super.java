class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int y){
        this.a = y;
    }
    public int returnnone() {
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int x){
        super(x);
        System.out.println("I am a constructor");
    }
}
public class this_super {
    public static void main(String[] args) {
        Ekclass a = new Ekclass(5);
        Doclass v = new Doclass(23);
        System.out.println(a.getA());
    }
}
