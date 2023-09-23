import java.util.Scanner;
public class sequencia_logica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, Y;
        X = sc.nextInt();
        Y = sc.nextInt();

        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            
            if (i % X == 0 || i == Y) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
