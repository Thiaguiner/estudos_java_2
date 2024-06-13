package map_exercicio_proposto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>(); // Usei LinkedHashMap para manter a ordem

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // Para ler o arquivo

            String line = br.readLine(); // Para ler a linha
            while (line != null) { // Enquanto a linha não for null, continue rodando
                String[] fields = line.split(","); // Para quebrar a string, separa pela vírgula
                String name = fields[0].trim(); // Primeiro elemento antes da vírgula é o nome, removendo espaços em branco
                int count = Integer.parseInt(fields[1].trim()); // Segundo elemento é o count, removendo espaços em branco

                if (votes.containsKey(name)) {
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                } else {
                    votes.put(name, count);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
