
import java.util.Scanner;

public class jogodavelhaExemplo {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        inicializarTabuleiro(tabuleiro);

        boolean jogadorX = true; // true para jogador X, false para jogador O
        boolean jogoAcabou = false;

        Scanner scanner = new Scanner(System.in);

        while (!jogoAcabou) {
            exibirTabuleiro(tabuleiro);

            char simbolo = jogadorX ? 'X' : 'O';

            System.out.print("Jogador " + simbolo + ", digite a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Jogador " + simbolo + ", digite a coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (validarJogada(tabuleiro, linha, coluna)) {
                tabuleiro[linha][coluna] = simbolo;
                jogoAcabou = verificarVitoria(tabuleiro, simbolo) || verificarVelha(tabuleiro);
                jogadorX = !jogadorX; // Troca de jogador
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }

        exibirTabuleiro(tabuleiro);

        if (verificarVitoria(tabuleiro, 'X')) {
            System.out.println("Jogador X ganhou!");
        } else if (verificarVitoria(tabuleiro, 'O')) {
            System.out.println("Jogador O ganhou!");
        } else {
            System.out.println("Deu velha!");
        }

        scanner.close();
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < tabuleiro[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < tabuleiro.length - 1) {
                System.out.println("---------");
            }
        }
    }

    public static boolean validarJogada(char[][] tabuleiro, int linha, int coluna) {
        if (linha < 0 || linha >= tabuleiro.length || coluna < 0 || coluna >= tabuleiro[linha].length) {
            return false;
        }
        return tabuleiro[linha][coluna] == ' ';
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char simbolo) {
        // Verificação das linhas, colunas e diagonais
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
                return true; // Vitória na linha i
            }
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) {
                return true; // Vitória na coluna i
            }
        }
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true; // Vitória na diagonal principal
        }
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
            return true; // Vitória na diagonal secundária
        }
        return false;
    }

    public static boolean verificarVelha(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false; // Ainda há posições vazias no tabuleiro
                }
            }
        }
        return true; // Não há posições vazias, é velha
    }
}

