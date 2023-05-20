package desafios;

import java.util.Scanner;

public class Numerosimpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Números ímpares até " + numero + ":");
        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}