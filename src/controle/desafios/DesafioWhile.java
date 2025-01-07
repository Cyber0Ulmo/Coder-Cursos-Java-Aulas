package controle.desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner inputdata = new Scanner(System.in);
        Double result = 0.0;
        Double grade = 0.0;
        Double count = 0.0;
        Integer escapeNumber = 0;

        while (escapeNumber != -1){
            System.out.println("Enter student test result (0.0 - 10.0): ");
             grade= inputdata.nextDouble();
            if (grade >= 0 && grade <= 10){
                 result += grade;
                count++;
            } else {
                System.out.println("Enter a valid test result");
            }
            System.out.println("Enter another student test result type 1 or type -1 to exit");
            escapeNumber = inputdata.nextInt();
        }
        double average = result / count;
        System.out.printf(" Average test result is %.2f",average);



    }
}
