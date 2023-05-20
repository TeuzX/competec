package desafios;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero que você digitou foi " +numero+ " e ele é um número par");
        } else {
            System.out.println("O numero que você digitou foi " +numero+ " e ele é um número ímpar");
        }
    }
}