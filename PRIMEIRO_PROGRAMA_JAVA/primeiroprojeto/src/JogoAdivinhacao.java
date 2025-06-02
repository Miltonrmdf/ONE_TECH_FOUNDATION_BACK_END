import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(101); // Gera número entre 0 e 100
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("🎯 Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas!");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("✅ Parabéns! Você acertou o número!");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("🔺 O número é maior.");
            } else {
                System.out.println("🔻 O número é menor.");
            }
        }
        if (!acertou) {
            System.out.println("❌ Suas tentativas acabaram! O número era: " + numeroSecreto);
        }
    }
}
