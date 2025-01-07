package Fundamentos.DesafiosFinalSEC3;

import java.util.Locale;
import java.util.Scanner;

public class DesafioQuadradoCubo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter a value: ");
        Double numberInputed = inputData.nextDouble();

        Double power2 = Math.pow(numberInputed,2);
        System.out.printf("\nInputed number power² is : %.2f ",power2);
        Double power3 = Math.pow(numberInputed,3);
        System.out.printf("\nInputed number power³ is : %.2f ",power3);

        inputData.close();
    }
}
