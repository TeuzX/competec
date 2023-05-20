package desafios;

import java.util.Scanner;

public class desafioDDD {

    public static void main(String[] args){

        int ddd;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o DDD desejado: ");
        ddd = ler.nextInt();

        String estado = "";
        String giria = "";

        switch (ddd) {
            case 11:
                estado = "São Paulo";
                giria = "Mermão!";
                break;
            case 21:
                estado = "Rio de Janeiro";
                giria = "Valeu, meu rei!";
                break;
            case 31:
                estado = "Minas Gerais";
                giria = "Uai, sô!";
                break;
            case 41:
                estado = "Paraná";
                giria = "Bah, tche!";
                break;
            case 51:
                estado = "Rio Grande do Sul";
                giria = "Tchê!";
                break;
            case 61:
                estado = "Distrito Federal";
                giria = "Tá suave!";
                break;
            case 71:
                estado = "Bahia";
                giria = "Ôxe!";
                break;
            case 81:
                estado = "Pernambuco";
                giria = "Arretado!";
                break;
            case 91:
                estado = "Pará";
                giria = "Vai dar bom, bicho!";
                break;
            default:
                estado = "DDD não encontrado";
                break;
        }

        System.out.println("O DDD " + ddd + " pertence ao estado de " + estado + ". Gíria típica: '" + giria + "'");
    }
    
}
