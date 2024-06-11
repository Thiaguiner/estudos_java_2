package hashcode_equals;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("maria", "maria@gmail.com");
        Client c2 = new Client("maria", "alex@gmail.com");

        String a = "maria";
        String b = "joao";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));
    }
}
