package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        String escapeWord = "";

        do {
            System.out.println(
                    "Must say the magic´s words... ");
            System.out.println("Want quit?");
            escapeWord = inputData.next();
        } while (!escapeWord.equalsIgnoreCase("Wizard"));

        System.out.println("You reach the magic land ");

        inputData.close();
    }
}

