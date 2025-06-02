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

    //--------------Variáveis texto ex2---------------------------
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
    //--------------Final Variáveis texto ex2---------------------------

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

   //--------------Fim da implementação ex2------------------------

   //--------------Variáveis do ex3------------------------
    double baseQuadrado,alturaQuadrado,areaQuadrado,raio,totalCircunferencia=0.0;
    double pi= Math.PI;
    //--------------Fim das Variáveis do ex3------------------------

    //--------------Variáveis texto ex3-----------------------------
    String ex3,textoBase,textoAltura,textoArea,textoRaio,textoCircunferencia,textocaso1,textocaso2,textoOpcaoDefault;
    ex3="""
    Crie um menu que oferece duas opções ao usuário: "
    1. Calcular área do quadrado" e "
    2. Calcular área do círculo".
       Solicite a escolha do usuário e
       realize o cálculo da área com base na opção selecionada.
    """;
    textoBase= """
            Digite o tamanho da base do Quadrado
            """;
    textoAltura= """
            Digite o tamanho da altura do Quadrado
            """;
    textoArea= """
            O tamanho da área é:
            """;
    textoRaio= """
            Digite o tamanho do raio
            """;
    textoCircunferencia= """
            A circunferencia é:%.2f%
            """;
    textocaso1= """
            Digite 1 para calcular área do quadrado
            """;
    textocaso2= """
            Digite 2 para calcular área do círculo
            """;
    textoOpcaoDefault= """
            Opção inválida. Favor, Digite somente 1 ou 2.
            """;
//--------------Final Variáveis texto ex3-----------------------------

//--------------Resolução, raciocínio do ex3-----------------------------

        Scanner digitando = new Scanner(System.in);

        System.out.println(textocaso1);

        System.out.println(textocaso2);

        int escolha = digitando.nextInt();

        switch (escolha){
            case 1:
                System.out.println(textoBase);
                baseQuadrado = digitando.nextInt();
                System.out.println(textoAltura);
                alturaQuadrado = digitando.nextInt();

                areaQuadrado=baseQuadrado*alturaQuadrado;
                System.out.println(textoArea+areaQuadrado);
                break;
            case 2:
                System.out.println(textoRaio);
                raio=digitando.nextInt();
                totalCircunferencia=pi*(raio*raio);
                System.out.println(textoCircunferencia+totalCircunferencia);
                break;
            default:
                System.out.println(textoOpcaoDefault);
        }
    //--------------Final da resolução, raciocínio do ex3-----------------------------

        //--------------Ex4-----------------------------

        System.out.println("Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.");
        Scanner taboadaDe = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = taboadaDe.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
 //--------------Final ex4-----------------------------


    }
}

