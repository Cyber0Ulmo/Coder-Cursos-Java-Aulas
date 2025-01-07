package classe.Desafio;

public class DataTeste {

    public static void main(String[] args) {

        Data date1 = new Data();
        Data date2 = new Data();
        Data date3 = new Data();


        date1.day = "16";
        date1.month = "april";
        date1.year = "1997";

        date2.day = "30";
        date2.month = "december";
        date2.year = "1993";

        System.out.println(date1.formattedDate());
        System.out.println(date2.formattedDate());
        System.out.println(date3.formattedDate());

    }
}
