package classe.Desafio;

public class Data {

    public String  day;
    public String month;
    public String year;


    public Data() {
        day = "01";
        month = "01";
        year = "1970";
    }

    public Data(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String formattedDate(){
        return String.format("%s/%s/%s" , day,month,year);
    }

    void printFormattedDate(){
        System.out.println(this.formattedDate());
    }
}
