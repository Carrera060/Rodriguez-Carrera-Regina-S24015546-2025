import java.util.Scanner;
public class E2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Double pi = 3.1416;
	System.out.println("Ingrese el radio del círculo:");
	Double radio = sc.nextDouble();
	Double resa = (radio*radio)*pi;
	System.out.println("Área del círculo: " + resa);
	Double resl = 2*pi*radio;
	System.out.println("La longitud del círculo es: " + resl);
	}
}