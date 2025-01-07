package Fundamentos.DesafiosFinalSEC3;

import java.util.Locale;
import java.util.Scanner;

public class DesafioBhaskara {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputData = new Scanner(System.in);

        double a = 1;
        double b = -12;
        double b1 = 12;
        double c = -13;

        double x1 =  (b + Math.sqrt((b1*b1) - 4 * a *c )) / (2 *a);
        double x2 = (b - Math.sqrt((b1*b1) - 4 * a *c )) / (2 *a);

        System.out.println(x1);
        System.out.println(x2);

        inputData.close();
    }
}
