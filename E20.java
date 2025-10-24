import java.util.Scanner;
	public class E20{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int limite = 100;
	int azar = (int)(Math.random() * limite);
	
	System.out.println("\t--Descuento cliente--");
	System.out.println("Ingrese el total de su compra: ");
	double total = sc.nextDouble();
	System.out.println("Número azar seleccionado: "+ azar);
	if (azar >74){
	 double descuento = total * 0.15;
	 double totald = total - descuento;
	System.out.println("Dinero que se descontó: " + descuento);
	System.out.println("El total con descuento es: " + totald); 
	} else {
	 double descuento = total * 0.20;
	 double totald = total - descuento;
	System.out.println("Dinero que se descontó: " + descuento);
	System.out.println("El total con descuento es: " + totald);
		}
	}
}