package _list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Employee # " + (i + 1) + ";");
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);//criando um funcionário, construtor com argumentos

            list.add(emp);//adicionando o elemento na lista

        }


        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();//leu id

        //forma de encontrar o id
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);


//        Integer pos = position(list, idSalary);//procura o id

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    //função para encontrar o id na lista
    //para saber se existe e se quando encontrar, manusear ele
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
