import java.util.Scanner;

public class twopiece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em Frutas: ");
        int valorEmFrutas = scanner.nextInt();

        double taxaReais = 0.47;
        double taxaDolares = 0.091;
        double taxaEuros = 0.077;
        double taxaIenes = 10.0;
        
        double valorEmReais = valorEmFrutas * taxaReais;
        double valorEmDolares = valorEmFrutas * taxaDolares;
        double valorEmEuros = valorEmFrutas * taxaEuros;
        double valorEmIenes = valorEmFrutas * taxaIenes;
        
        System.out.println("Valor em Dólares: " + valorEmDolares);
        System.out.println("Valor em Reais: " + valorEmReais);
        System.out.println("Valor em Euros: " + valorEmEuros);
        System.out.println("Valor em Ienes: " + valorEmIenes);

        scanner.close();
    }
}
