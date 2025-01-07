package Fundamentos.DesafiosFinalSEC3;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAreaTriagulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter heigth of triangle: ");
        Double triangleHeight = inputData.nextDouble();
        System.out.println(" Enter the triangle base: ");
        Double triangleBase = inputData.nextDouble();

        double triangleArea = (triangleBase * triangleHeight) / 2;

        System.out.printf("Triangle area is %.2f ", triangleArea);

        inputData.close();
    }
}
