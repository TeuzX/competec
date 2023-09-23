public class duvida_switch {
    
    public static void main(String[] args){

        int numero_mes= 1;
        switch (numero_mes){
        case 1:
            System.out.println("Janeiro");
            break;
        case 2:
            System.out.println("Fevereiro");
            break;
        case 3:
            System.out.println("Março");
            break;
        default:
        System.out.println("Esse mês não esta no nosso codigo!!!");
            break;
        }
    }
}