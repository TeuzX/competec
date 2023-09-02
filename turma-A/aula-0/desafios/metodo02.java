public class metodo02 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;
        int resultado = somarNumeros(numero1, numero2);
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
    }

    public static int somarNumeros(int a, int b) {
        return a + b;
    }
}
