public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1986;
        boolean incluidoNoPlano= false;
        double notaDoFilme= 8.1;
        String tipoPlano="Normal";

        if (anoDeLancamento>=2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){// condicional || é o 'ou' --- && é o 'e'
            System.out.println("Filme Liberado!!");
        }else{
            System.out.println("Deve pagar locação!!");



            /* uma alternativa ao if é o switch

int dia = 3;
String nomeDia;

switch (dia) {
   case 1:
      nomeDia = "domingo";
      break;
   case 2:
      nomeDia = "segunda-feira";
      break;
   case 3:
      nomeDia = "terça-feira";
      break;
   case 4:
      nomeDia = "quarta-feira";
      break;
   case 5:
      nomeDia = "quinta-feira";
      break;
   case 6:
      nomeDia = "sexta-feira";
      break;
   case 7:
      nomeDia = "sábado";
      break;
   default:
      nomeDia = "Dia inválido";
      break;
}

System.out.println("O dia " + dia + " é " + nomeDia);*/
        }
    }
}
