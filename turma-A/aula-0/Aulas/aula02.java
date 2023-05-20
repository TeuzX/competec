public class aula02 {
    
    public static void main(String[] args){

        /*int contador = 0;
        while (contador < 5) {
            System.out.println("01");
            contador++;
        }*/

        /*int soma = 0;
        int contador = 1;

        while (contador < 101){
        soma+=contador;
        contador++;
        System.out.println("Soma atual: " +soma);
        }
        System.out.println("A soma final é: " +soma);*/ 

        /*for(int i = 0;i<10;i++){

            if(i==5) break;

            System.out.print(i+"");
        }*/

        for(int i = 0;i<10;i++){

            if(i==5) continue;

            System.out.println(i+"");
        }
    }
}
