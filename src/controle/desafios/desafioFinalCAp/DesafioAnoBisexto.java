package controle.desafios.desafioFinalCAp;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class DesafioAnoBisexto {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        int todayYear = todayDate.getYear();
        boolean isLeapYear = todayDate.isLeapYear();

        if (isLeapYear){
            System.out.println("Year now " + todayYear + " is Leap year");
        } else {
            System.out.println("Year now " + todayYear + " is not Leap year");
        }
    }
}
