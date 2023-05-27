import java.util.Scanner;
public class primos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Número de casos de teste

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt(); // Valor a ser verificado

            if (isPrimo(X)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}