import java.util.Scanner;
public class aula1 {
    public static void main(String[] args){
        /*Double abacaxi = 7.38;
        Double maca = 2.0;
        Double pera = 3.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos abacaxis você deseja ");
        abacaxi *= entrada.nextInt();
        System.out.println("Digite quantas maçã você deseja ");
        maca *= entrada.nextInt();
        System.out.println("Digite quantas pera você deseja ");
        pera *= entrada.nextInt();

        Double resultado = abacaxi + maca + pera;

        System.out.println("O valor total das suas compras foi de R$" + resultado);*/

        /*Scanner entrada = new Scanner(System.in);

           int valor1, valor2;

           System.out.println("Digite o primeiro valor ");
           valor1 = entrada.nextInt();

           System.out.println("Digite o segundo valor ");
           valor2 = entrada.nextInt();

           if (valor1 == valor2) {
            System.out.println("Os valores são iguais");
            
           }
           else {
            System.out.println("Os valores são diferentes");
           
           }*/

           /*Scanner entrada = new Scanner(System.in);

           int idade;
           System.out.println("Digite sua idade ");
           idade = entrada.nextInt();

           if (idade >= 18) {

            System.out.println("Você é maior de idade");
            
           }
           else {
            System.out.println("Você é menor de idade");
           }*/

           /*Scanner entrada = new Scanner(System.in);

           int idade1, idade2;
           System.out.println("Digite sua idade ");
           idade1 = entrada.nextInt();

           System.out.println("Digite sua idade ");
           idade2 = entrada.nextInt();

           if (idade1 == idade2) {

            System.out.println("Primeira idade é igual a segunda idade");
            
           }
           else if(idade1 > idade2) {

            System.out.println("Primeira idade é maior que a segunda idade");
            
           }
           else {
            System.out.println("Primeira idade é menor que a segunda idade");*/

            /*Boolean chuva;
            Boolean nublado;
            Boolean sol;

            Scanner entrada = new Scanner(System.in);

           System.out.println("Esta chovendo ?");
           chuva = entrada.nextBoolean();
           System.out.println("Esta nublado ?");
           nublado = entrada.nextBoolean();

           /*if (chuva == true || nublado ==true) {
            System.out.println("Esta chovendo ou nublado");
           }else{
            System.out.println("Esta ensolarado");
           }*/

           /*Boolean chuva;
           Boolean guardachuva;

           Scanner entrada = new Scanner(System.in);

           System.out.println("Esta chovendo ?");
           chuva = entrada.nextBoolean();
           System.out.println("Trouxe o guarda chuva ?");
           guardachuva = entrada.nextBoolean();

           if (chuva == true && guardachuva == true) {
            System.out.println("Esta chovendo e estou suave");
           }
           else if(chuva == true && guardachuva == false ) {
            System.out.println("Esta chovendo e estou ferrado");
           }
           else {
            System.out.println("Esta ensolarado e estou suave");
           }*/

           /*String opcao;
           Scanner entrada = new Scanner(System.in);

           System.out.println("Qual operação você deseja fazer ?");
           System.out.println("||| A = DEPOSITO /n B = SAQUE /n C = EMPRESTIMO |||");
           opcao = entrada.nextLine();

           switch (opcao) {
            case "a":
                System.out.println("Você escolheu a opção Deposito, siga....");
                break;
           case "b":
                System.out.println("Você escolheu a opção Saque, siga....");
                break;
            case "c":
                System.out.println("Você escolheu a opção Emprestimo, siga....");
                break;
           }*/

           int num;

           Scanner entrada = new Scanner(System.in);

           System.out.println("Digite um numero: ");
           num = entrada.nextInt();

           if (num%3 == 0 && num%5 == 0) {
            System.out.println("VERDADEIRO, ele é multiplo de ambos");
            
           }
           else if(num%3 == 0 || num%5 == 0){
            System.out.println("VERDADEIRO, ele é multiplo de algum deles");
           }
           else{
            System.out.println("FALSO");
           }
        }
}