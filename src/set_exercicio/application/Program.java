package set_exercicio.application;

import set_exercicio.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedindo para usuario digitar o caminho do arquivo
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        //abrindo o arquivo e disponibilizando o br para ler o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //
            Set<LogEntry> set = new HashSet<>();

            //lendo o arquivo
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
