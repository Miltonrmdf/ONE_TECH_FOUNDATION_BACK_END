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
    }
}