package controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        String conceito = "";
        System.out.println("Input your grade: ");
        int grade = inputData.nextInt();

        switch (grade){
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "c";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                conceito = "invalid !!!";
        }

        System.out.println("grade: " + conceito);

        inputData.close();
    }
}