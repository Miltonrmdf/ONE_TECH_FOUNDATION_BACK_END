public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano= true;
        double notaDoFilme= 8.1;
        //Média calculada por 3 pessoas
        double media = (9.8+6.3+8.0)/3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de ação com galã do anos 80
                Muito bom!!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println( sinopse);

        int classificacao = (int) (media/2);

        System.out.println("Classificação "+classificacao+ " Estrelas");


        }
}