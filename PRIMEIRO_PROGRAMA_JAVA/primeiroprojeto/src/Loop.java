import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaavaliacao= 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble();
            mediaavaliacao += nota;
        }
        System.out.println("Media de avalições "+mediaavaliacao/3);

    }

}
