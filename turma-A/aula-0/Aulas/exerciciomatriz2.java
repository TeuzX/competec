public class exerciciomatriz2 {
    
    public static void main(String[] args) {

        int tabela[][] =new int[10][10];
        int contador = 0;

        for(int i=0;i< 10;i++){

        for(int j=0;j<10;j++){
           // System.out.print(tabela[i][j]+" ");
            tabela[i][j] = contador;
            contador++;
        }
        System.out.print("");
    }

    for(int i=0;i< 10;i++){

        for(int j=0;j<10;j++){
            System.out.print(tabela[i][j]+" ");
           
        }
        System.out.println("");
    }


    }

    
}
