package comparable_;

import comparable_.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();//list de string
        String path = "C:\\Users\\thiag\\in.txt";//caminho do arquivo


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {//leitura de arquivo

            String employeeCsv = br.readLine();//lendo a linha no arquivo
            while (employeeCsv != null) {//enquanto o nome for != null vou adicionando os nomes na list
                String[]fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);//forma de ordenar uma coleção
            for (Employee emp : list) {//percorrendo a list
                System.out.println(emp.getName() + ", " + emp.getSalary());//imprimindo os argumentos
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
