public class Main {
    public static void main(String[] args) {
        System.out.println("Desafio: hora da prática 1");
        System.out.println("Crie um programa que realize a média de duas notas decimais e exiba o resultado.");

        int nota1 = 3;
        int nota2 = 5;
        double media =  (double) (nota1 + nota2) /2;

        String mensagem = String.format( """
                A primeira nota é %d
                A segunda nota é %d
                A média entre as duas nota é %.2f
                """,nota1,nota2,media);
        System.out.println(mensagem);

/*2. Declare uma variável do tipo double e uma variável do tipo int.
Faça o casting da variável double para int e imprima o resultado.*/

        String ex2 = String.format("""
                
                2. Declare uma variável do tipo double e uma variável do tipo int.
                Faça o casting da variável double para int e imprima o resultado.""");
        System.out.println(ex2);

        double preco1 = 12.55;
        System.out.println("O Valor da variável double preco1 é "+preco1);
        preco1= (int) preco1;
        System.out.println("O Valor da variável int preco1 é "+preco1);

        String ex3 = String.format("""
                
                3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
                Atribua valores a essas variáveis e concatene-as em uma mensagem.
                """);
        System.out.println(ex3);
        char primeiraLetraNome = 'M';
        System.out.println("A primeira letra foi = "+primeiraLetraNome);
        String restoDoNome= "ilton";
        System.out.println("O restro do nome é = "+restoDoNome);
        System.out.println("O nome completo é "+primeiraLetraNome+restoDoNome);

        String ex4 = String.format("""
                
                4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
                Calcule o valor total multiplicando o preço do produto pela quantidade 
                e apresente o resultado em uma mensagem.""");
        System.out.println(ex4);
            int precoProduto=55;
            int quantidadeProduto=137;
            double total = (double) precoProduto*quantidadeProduto;
            String mensagemProduto = String.format("""
                       O preço do produto é %d
                       A quantidade é %d
                       A quantidade vezes o preço do produto é: %.2f"""
                    ,precoProduto,quantidadeProduto,total);
        System.out.println(mensagemProduto);

        String ex5 = """
                
                5.Declare uma variável do tipo double valorEmDolares.
                Atribua um valor em dólares a essa variável.
                Considere que o valor de 1 dólar é equivalente a 4.94 reais.
                Realize a conversão do valor em dólares para reais 
                e imprima o resultado formatado.
                """;
        System.out.println(ex5);
        double valorEmDolares= 253.37;
        double valorEmReais=4.94;
        double conversaoDolarEmReais=valorEmDolares*valorEmReais;

        String conversao =String.format("""
                Valor em dolares é $%.2f
                Cotação do dolar em reais é R$%.2f
                Valor em colares convertido em reais é R$%.2f""",
                valorEmDolares,valorEmReais,conversaoDolarEmReais);
        System.out.println(conversao);

        }
}