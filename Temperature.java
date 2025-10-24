import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de dados
        // O uso do try-with-resources garante que o Scanner seja fechado automaticamente.
        try (Scanner sc = new Scanner(System.in)) {
            // Solicita ao usuário para digitar a temperatura em Celsius
            System.out.print("Digite a temperatura em Celsius (°C): ");

            // Verifica se o próximo token é um double para evitar erros de entrada
            if (sc.hasNextDouble()) {
                double celsius = sc.nextDouble();

                // Calculando a temperatura em Fahrenheit
                // CORREÇÃO: Usar 9.0/5.0 para garantir uma divisão de ponto flutuante (decimal)
                double fahrenheit = (celsius * 9.0/5.0) + 32;

                // Calculando a temperatura em Kelvin
                double kelvin = celsius + 273.15;

                // Exibindo os resultados
                System.out.printf("\n--- Resultados ---\n");
                System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
                System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
                System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
                System.out.printf("------------------\n");
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            }
        }
    }
}
