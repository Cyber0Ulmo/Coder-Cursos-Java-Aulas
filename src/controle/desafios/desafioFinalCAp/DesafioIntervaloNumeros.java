package controle.desafios.desafioFinalCAp;

import java.util.Locale;
import java.util.Scanner;

public class DesafioIntervaloNumeros {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter a number in a range of 0 - 10: \n");
        int inputedNUmber = inputData.nextInt();

        if (inputedNUmber >= 0 && inputedNUmber <= 10 ){
            System.out.printf("inputed number = %d on a range of 0 - 10 ", inputedNUmber);
        } else {
            System.out.printf("inputed number is out of range = %d", inputedNUmber);
        }
        inputData.close();
    }
}
