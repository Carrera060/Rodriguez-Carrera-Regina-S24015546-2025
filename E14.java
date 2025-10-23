import java.util.Scanner;
public class E14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double totalComision = 0;
        System.out.println("\t\t-- Comisiones de vendedor --\n");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el valor de la venta #" + i + ": ");
            double venta = sc.nextDouble();
            double comision = 0;
            if (venta <= 10000000) {
                comision = venta * 0.02;
            } else if (venta > 10000000 && venta < 15000000) {
                comision = venta * 0.04;
            } else if (venta >= 15000000) {
                comision = venta * 0.10;
            }
            System.out.println("Comisión de la venta #" + i + ": " + comision);
            totalComision += comision;
        }
        System.out.println("\nTotal ganado por comisiones: " + totalComision);
    }
}
