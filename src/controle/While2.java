package controle;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        String escapeWord = "";

        while (!escapeWord.equalsIgnoreCase("sair")){
            System.out.println("enter a word: ");
            escapeWord = inputData.next();
        }
            inputData.close();
    }
}
