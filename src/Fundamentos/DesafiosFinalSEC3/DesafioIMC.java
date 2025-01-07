package Fundamentos.DesafiosFinalSEC3;

import java.util.Locale;
import java.util.Scanner;

public class DesafioIMC {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter your Height: ");
        Double heightInputed = inputData.nextDouble();
        System.out.println("Enter your weight: ");
        Double weightInputed = inputData.nextDouble();

        Double result = weightInputed / (Math.pow(heightInputed, 2));

        System.out.printf("Your IMC is %.2f ", result);

        inputData.close();
    }
}
