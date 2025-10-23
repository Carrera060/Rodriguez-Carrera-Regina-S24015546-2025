import java.util.Scanner;
public class E16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int N = sc.nextInt();
        System.out.println("Número ingresado: " + N);
        if (N % 2 == 0) {
            System.out.println("El número es Par");
        } else {
            System.out.println("El número es Impar");
        }
    }
}
