import java.util.Scanner;
public class E5{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double f = 32;
	System.out.println("Ingrese grados centigrados: ");
	double tc = sc.nextDouble();
	double r = (tc*9/5) + f;
	System.out.println("Los grados en Fahrenheit son: " + r);
	double ta = tc + 273.15;
	System.out.println("Los grados en temperatura absoluta son: " + ta);
	}
}