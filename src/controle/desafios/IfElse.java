package controle.desafios;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(
                "enter a number: ");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("'PAR' number");
        } else {
            System.out.println("'ímpar' number");
        }
    }
}
