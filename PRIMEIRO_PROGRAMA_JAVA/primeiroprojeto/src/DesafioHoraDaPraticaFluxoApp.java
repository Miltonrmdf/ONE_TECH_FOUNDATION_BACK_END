import java.util.Scanner;

public class DesafioHoraDaPraticaFluxoApp {
    public static void main(String[] args) {
       //--------------Variáveis do ex1---------------
        int numeroPositivo = 1;
        int numeroNegativo = -1;
        int numeroZero = 0;
        Scanner leituraNumero = new Scanner(System.in);
        int numeroDigitado;
        //--------------Final Variáveis ex1---------------

        //--------------Textos ex1------------------------
        String ex1;
        ex1 = """
                1.Crie um programa que solicite ao usuário digitar um número.
                  Se o número for positivo,
                  exiba "Número positivo",
                  caso contrário, exiba "Número negativo".
                """;
        String textoNumeroPositivo;
        textoNumeroPositivo = """
                Esse número é positivo!!
                """;
        String textoNumeroNegativo;
        textoNumeroNegativo = """
                Esse número é negativo!!
                """;
        String textoDigitouZero;
        textoDigitouZero = """
                Você digitou zero!!!
                """;
        String textoFavorDigiteNumero;
        textoFavorDigiteNumero = """
                Favor digite um numero;
                """;
    //--------------Final Textos ex1------------------------

    //--------------Interação na tela ex1------------------------
        System.out.println(ex1);
        numeroDigitado= leituraNumero.nextInt();
    //--------------Interação na tela ex1------------------------

    //--------------Implementação ex1------------------------
        if (numeroDigitado>=numeroPositivo){
            numeroPositivo=numeroDigitado;
           System.out.println(textoNumeroPositivo);
        }else{
            if(numeroDigitado<=numeroNegativo){
                numeroNegativo=numeroDigitado;
                System.out.println(textoNumeroNegativo);
            }else{
                if (numeroDigitado==numeroZero){
                    numeroZero=numeroDigitado;
                    System.out.println(textoDigitouZero);
                }else{
                        System.out.println(textoFavorDigiteNumero);
                    }
                }
            }
    //--------------Final da Implementação ex1------------------------

    //--------------Variáveis ex2---------------------------------
        int numInteiro1,numInteiro2,numInteiroDigitado = 0;
        Scanner leituraNumInteiroDigitado = new Scanner(System.in);
    //--------------Final Variáveis ex2---------------------------

    //--------------Variáveis ex2---------------------------
        String ex2,textoNumIguais,textoNumDiferentes,
                textoNumPrimeiroMaior,textoNumPrimeiroMenor,textoDigPriNum,textoDigSegNum;
            ex2 = """
            2.Peça ao usuário para inserir dois números inteiros.
            Compare os números e imprima uma mensagem indicando
            se são iguais, diferentes,
            o primeiro é maior ou o segundo é maior.
            """;
            textoNumIguais= """
                    Você digitou dois números iguais!""";
            textoNumDiferentes= """
                    Você digitou dois números diferentes!
                    """;
            textoNumPrimeiroMaior = """
                    O primeiro número é maior!
                    """;
            textoNumPrimeiroMenor= """
                    O primeiro número é menor
                    """;
            textoDigPriNum= """
                    Digite o primeiro número:
                    """;
            textoDigSegNum= """
                    Digite o segundo número:
                    """;


    //--------------Interação na tela ex2------------------------------
        System.out.println(ex2);
        System.out.println(textoDigPriNum);
        numInteiro1=leituraNumInteiroDigitado.nextInt();
        System.out.println(textoDigSegNum);
        numInteiro2=leituraNumInteiroDigitado.nextInt();


    //--------------Final Interação na tela ex2------------------------

    //--------------Inicio implementação ex2------------------------
        if (numInteiro2 == numInteiro1){
            System.out.println(textoNumIguais);
                }else{
                    if(numInteiro1!=numInteiro2){
                        System.out.println(textoNumDiferentes);
                    }
                }

        if(numInteiro1>numInteiro2){
            System.out.println(textoNumPrimeiroMaior);
                }else{
                    if (numInteiro1<numInteiro2){
                        System.out.println(textoNumPrimeiroMenor);
                        }
                    }
                }
        }
         //--------------Fim da implementação ex2------------------------



