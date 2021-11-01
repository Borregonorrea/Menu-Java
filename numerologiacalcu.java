import java.util.Scanner;

public class numerologiacalcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("\nNumeros del 1 al " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}