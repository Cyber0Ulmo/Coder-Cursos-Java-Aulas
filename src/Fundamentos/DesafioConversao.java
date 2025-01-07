package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        String value1 = inputData.nextLine().replace(",", ".");
        System.out.println("Digite o segundo salário: ");
        String value2 = inputData.nextLine().replace(",", ".");
        System.out.println("digite o terceiro salário: ");
        String value3 = inputData.nextLine().replace(",", ".");

        double valu1Converted = Double.parseDouble(value1);
        double value2Converted = Double.parseDouble(value2);
        double value3Converted = Double.parseDouble(value3);
        double averageSalary = (valu1Converted + value2Converted + value3Converted) / 3;

        System.out.println(averageSalary);



        inputData.close();
    }
}
