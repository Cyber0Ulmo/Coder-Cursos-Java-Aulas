package classe;

import classe.Desafio.Data;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a ++;
        b --;

        Data date1 = new Data("07","11", "2022");
        Data date2 = date1;

        date1.day = "31";
        date2.month = "12";

        

    }
}
