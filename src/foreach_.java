public class foreach_ {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "bob", "alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("---------------");

        for (String apelido : vect) {
            System.out.println(apelido);
        }
    }
}
