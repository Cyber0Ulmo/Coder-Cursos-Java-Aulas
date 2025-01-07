package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("digite o primiero número: ");
        double firstNumber = inputData.nextDouble();
        System.out.println("digite o segundo número: ");
        double secondNumber = inputData.nextDouble();
        System.out.println("digite a operação desejada: ");
        String selectedOperation = inputData.next();

        boolean operationPlus = selectedOperation.equals("+");
        boolean operationMinus = selectedOperation.equals("-");
        boolean operationMultiple = selectedOperation.equals("*");
        boolean operationDivide = selectedOperation.equals("/");

        double resultOp = operationPlus ? firstNumber + secondNumber : 0;
        resultOp = operationMinus ? firstNumber - secondNumber : resultOp;
        resultOp = operationMultiple ? firstNumber * secondNumber : resultOp;
        resultOp = operationDivide ? firstNumber / secondNumber : resultOp;


        System.out.printf("%f %s %f = %.2f ", firstNumber, selectedOperation,secondNumber,resultOp);
        inputData.close();
    }
}
