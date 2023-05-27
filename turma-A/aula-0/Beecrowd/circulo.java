import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor do raio
        double raio = scanner.nextDouble();

        // Calcular a área da circunferência
        double area = 3.14159 * Math.pow(raio, 2);

        // Imprimir o resultado com 4 casas decimais
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
