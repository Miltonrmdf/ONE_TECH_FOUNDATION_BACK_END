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

            }
        }




