package application_Student;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();

        System.out.println("Name: ");
        stud.name = sc.nextLine();

        System.out.println("GRADE 1: ");
        stud.grade1 = sc.nextDouble();

        System.out.println("GRADE 2: ");
        stud.grade2 = sc.nextDouble();

        System.out.println("GRADE 3: ");
        stud.grade3 = sc.nextDouble();

        System.out.println("Final Grade: " + stud.FinalGrade());

        if(stud.FinalGrade() > 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("MISSING: " + stud.Missing());
        }



    }
}
