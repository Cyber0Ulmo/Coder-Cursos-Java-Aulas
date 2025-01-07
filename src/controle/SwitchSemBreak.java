package controle;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("groselha1");
            case "marrom":
                System.out.println("groselha2");
            case "roxa":
                System.out.println("groselha3");
            case "verde":
                System.out.println("chega de groselha");
            default:
                System.out.println("cural");
        }
    }
}
