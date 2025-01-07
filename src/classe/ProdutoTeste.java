package classe;

import java.util.Locale;

public class ProdutoTeste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produto product1 = new Produto();
        Produto product2 = new Produto();

        product1.nome = "flying cloud";
        product1.preco = 10000;


        product2.nome = "magic bo";
        product2.preco = 10000;


        double totalProduct1 = product1.precoDesconto();
        double totalProduct2 =  product2.precoDesconto();

        double totalProduct11 = product1.precoDesconto(0.05);
        double totalProduct22 =  product2.precoDesconto(0.05);



        System.out.println(totalProduct1);
        System.out.println(totalProduct2);

        System.out.println(totalProduct11);
        System.out.println(totalProduct22);
    }
}
