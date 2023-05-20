import java.util.Scanner;

public class aula0{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Bom dia, qual é o seu nome? ");
        String nome = entrada.nextLine();

        System.out.print("E qual é sua idade? ");
        int idade = entrada.nextInt();

        System.out.println("Seu nome é: " + nome);

        System.out.println("Sua idade é: " + idade);

        entrada.close();

        /*int idade = 16;
        systen.out.printIn("Idade "+idade);
        idade = 17;
        system.ot.printIn("Idade "+idade);
        boolean café = false;
        char[] nome = [('g','a','b','s')];
        system.ot.printIn("nome "+nome);*/

        /*String nome;
        nome = ("Mateus");

        int idade = 16;

        System.out.println(nome + ": idade = " +idade);*/

        /*int n1 = 10;
        int n2 = 12;

        int resultado = n1 % n2;

        System.out.println(resultado);*/

        /*double laranja = 20.3;
        double uva = 13.5;

        double resultado = uva + laranja;

        System.out.println("A laranja vale: R$" + laranja +  "\nA uva vale: R$" + uva + " \nA soma delas e igual a: R$" +resultado);*/

        /*int n1 = 2;
        int n2 = 1;

        n2++;
        n1 +=n2;*/

        /*System.out.print("Hello Word !!!\n");
        System.out.print("als,as\n");*/

        /*String nome1 = "Cristiano Ronaldo";
        String nome2 = "Manoel Gomes";
        System.out.printf("%d e %d ",nome1,nome2);*/

    }
}