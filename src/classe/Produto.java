package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    double precoDesconto(){
        return preco * (1 - desconto);
    }

    double precoDesconto(double descontoGerente){
        return preco *( 1 - (descontoGerente + desconto));
    }
}


