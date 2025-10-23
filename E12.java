import java.util.Scanner;
public class E12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t-- Pago del empleado --\n");
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        double horas = sc.nextDouble();
	System.out.println("\n\t-Tabla de categorías-\t");
	System.out.println(" Categoría 1: $20,000\n Categoría 2: $15,000\n Categoría 3: $10,000\n Categoría 4: $7,500\n");
        System.out.print("Ingrese la categoría del empleado (1-4): ");
        int categoria = sc.nextInt();
        double pagoHora = 0;

        if (categoria == 1) {
            pagoHora = 20000;
        } else if (categoria == 2) {
            pagoHora = 15000;
        } else if (categoria == 3) {
            pagoHora = 10000;
        } else if (categoria == 4) {
            pagoHora = 7500;
        } else {
            System.out.println("Categoría inválida. Debe ser 1, 2, 3 o 4.");S
        }

        double salarioBruto = horas * pagoHora;
        double descuentoSalud = salarioBruto * 0.072;
        double salarioConDescuento = salarioBruto - descuentoSalud;
        double subsidio = 0;
        if (salarioBruto < 1000000) {
            subsidio = salarioBruto * 0.15;
        }
        double salarioFinal = salarioConDescuento + subsidio;
        System.out.println("\nSalario bruto: " + salarioBruto);
        System.out.println("Descuento de salud: " + descuentoSalud);
        System.out.println("Subsidio: " + subsidio);
        System.out.println("Salario final a pagar: " + salarioFinal);
    }
}
