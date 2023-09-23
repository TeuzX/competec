import java.util.Scanner;
public class  preenchimento_vetor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int[] N = new int[10];

        N[0] = V; // Coloca o valor lido na primeira posição do vetor

        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2; // Preenche as próximas posições com o dobro do valor anterior
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]); // Imprime o vetor
        }

        sc.close();
    }
}
