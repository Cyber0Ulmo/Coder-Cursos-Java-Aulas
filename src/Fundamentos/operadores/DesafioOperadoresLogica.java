package Fundamentos.operadores;

public  class  DesafioOperadoresLogica {
    public static void main(String[] args) {
        // Trabalho na terça
        // trabalho na quinta
        // SE os 2 trabalhos deram certo tv de 50 pol no final de semana
        // 1 tv 32 pol
        // 1 tomar sorvete
        // nenhum em casa

        boolean trabalhoQuinta = true;
        boolean trabalhoTerca = true;

        boolean TV50 = trabalhoQuinta && trabalhoTerca;
        boolean TV32 = trabalhoQuinta ^ trabalhoTerca;
        boolean sorveteFds = trabalhoQuinta || trabalhoTerca;
        boolean ficarCasa = !trabalhoQuinta || !trabalhoTerca;

    }
}

