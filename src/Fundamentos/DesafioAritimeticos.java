package Fundamentos;

import java.util.Locale;

public class DesafioAritimeticos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Double firstPartTop = (double) 6 * (3 + 2);
        Double firtsPartTopPOW = Math.pow(firstPartTop, 2);
        Double firtsPartBotom = (double) 3 * 2;
        Double firstPart = firtsPartTopPOW / firtsPartBotom;

        Double secondPartTop = (double)(1 - 5) * (2 -7);
        Double secondPart = secondPartTop / 2;
        Double secondPartFinal = Math.pow(secondPart, 2);

        Double finalPart = firstPart - secondPartFinal;
        Double result = Math.pow(finalPart,3) / Math.pow(10, 3);
        System.out.println(result);

        // ********************* solução *********************

        double numA = Math.pow(6 * (3 +2), 2);
        double denA = 3*2;

        double numB = (1 -5) * (2-7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB =  Math.pow(numB/ denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;






    }
}
