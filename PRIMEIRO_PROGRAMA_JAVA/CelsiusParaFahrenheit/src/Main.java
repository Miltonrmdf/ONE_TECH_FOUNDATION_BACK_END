public class Main {
    public static void main(String[] args) {
        System.out.println("Conversão Celsius para Fahrenheit");

            double temperaturaCelsius = 25.8;
            double temperaturaFahrenheit= (temperaturaCelsius*1.8)+32;

           System.out.println("A temperatura em Celsius de "+ temperaturaCelsius);
        System.out.println("Convertida para Fahrenheit é "+ temperaturaFahrenheit);

    }
}
/*Orientação do professor
* public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }*/