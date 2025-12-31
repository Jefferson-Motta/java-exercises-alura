public class DesafioTemperatura {
    public static void main(String[] args) {
        // Converte temperatura de graus Celsius para Fahrenheit.

        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;

        String mensagem = String.format("""
            Conversor de temperatura de graus Celsius para Fahrenheit
            
            Temperatura em Celsius: %.1f
            Temperatura em Fahrenheit %.1f
            Temperatura em Fahrenheit inteira é: %d
            """,temperaturaEmCelsius,temperaturaEmFahrenheit,temperaturaEmFahrenheitInteira);

        System.out.println(mensagem);


    }

}