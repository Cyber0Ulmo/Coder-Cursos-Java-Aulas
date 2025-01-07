package controle.desafios.desafioFinalCAp;

import java.util.Locale;
import java.util.Scanner;

public class DesafioNota {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter grade one: ");
        double firstGrade = inputData.nextDouble();
        System.out.println("Enter garde two: ");
        double secondGrade = inputData.nextDouble();

        double average = (firstGrade + secondGrade) / 2;

        if (average >= 7.0){
            System.out.println("Aprovado");
        } else if (average < 7 && average >= 4.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        inputData.close();
    }
}
