import java.util.Scanner;
public class E17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t--Número primo o no--");
        System.out.println("Ingresa un número:");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("No es primo");
        } else {
            int i = 2;
            int divisor = 0;

            while (i < n) {
                if (n % i == 0) {
                    divisor = 1; // significa que tiene divisor
                    break; // ya no hace falta seguir revisando
                }
                i++;
            }

            if (divisor == 0) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
}