import java.util.Scanner;
public class E7{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double des = 0.15;
	System.out.println("Total de la compra sin descuento:");
	double tc = sc.nextDouble();
	double tcd = des*tc;
	System.out.println("El total de la compra con descuento es de: " + tcd);
	}
}