package Fundamentos.DesafiosFinalSEC3;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCelsiusFahrenheit {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter Celsius temperature: ");
        Double celsiusInputed = inputData.nextDouble();

        Double result = (celsiusInputed * 1.8) + 32;

        System.out.printf("Celsius coverted in Fahrenheit = %.2f ",result);

        inputData.close();
    }
}
