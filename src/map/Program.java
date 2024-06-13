package map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");//key,value
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "9898989898");

        cookies.remove("email");
        cookies.put("phone", "9797979797");//nao admite repeticoes na chave, ele sobrescreve o valor anterior

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//verificando se existe phone na key
        System.out.println("Phone number: " + cookies.get("phone"));//get pega o valor da key

        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
