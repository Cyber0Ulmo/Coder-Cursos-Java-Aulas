package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter week day: ");
        String day = inputData.next();

        if (day.equals("domingo")){
            System.out.println("1");
        } else if (day.equalsIgnoreCase("segunda")) {
            System.out.println("2");
        } else if (day.equalsIgnoreCase("terça")) {
            System.out.println("3");
        } else if (day.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if (day.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        }else if (day.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else {
            System.out.println("7");
        }

        inputData.close();
    }
}
