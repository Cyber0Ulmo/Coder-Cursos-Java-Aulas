package Fundamentos.DesafiosFinalSEC3;

import java.util.Locale;
import java.util.Scanner;

public class DesafioFahrenheitCelsius {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter Fahrenheit tempreature: ");
        Double fahrenheitInputed = inputData.nextDouble();

        Double result = (fahrenheitInputed - 32) / 1.8;

        System.out.printf("Fahrenheit converted in Celsius = %.2f", result);

        inputData.close();

    }
}
