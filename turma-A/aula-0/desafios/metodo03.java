public class metodo03 {
    public static void main(String[] args) {
        int numero = 7;
        mostrarTabuada(numero);
    }

    public static void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação para o número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
