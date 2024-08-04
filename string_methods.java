public class string_methods {
    public static void main(String[] args) {
        String name = "Ayush";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String a = "   hi heleo  ";
        System.out.println(a);
        System.out.println(a.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,3));

        System.out.println(name.replace('A','S'));
        System.out.println(name.replace("Ayush","Savita"));

        System.out.println(name.startsWith("Ay"));
        System.out.println(name.endsWith("shi"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("y"));
        System.out.println(name.indexOf("A",2));
    }
}
