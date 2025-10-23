import java.util.Scanner;
public class E13{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	System.out.println("\t-Resolver AX^2 + BX + C = 0-\t");
	System.out.print("Ingresa el valor de A: ");
	double a = sc.nextDouble();
	System.out.print("Ingresa el valor de B: ");
	double b = sc.nextDouble();
	System.out.print("Ingresa el valor de C: ");
	double c = sc.nextDouble();
	
	if (a == 0){
	System.out.println("ERROR: La ecuación no puede ser cuadrática porque el valor de A es 0");
	}else{
	double d = b*(b - 4)*a*c;
	if (d < 0){
	System.out.println("Error: Raices imaginarias.");
	}else{
	double r1 = (-b + Math.sqrt(d)) / (2 * a);
	if (d == 0){
	System.out.println("Raíz real única:");
	System.out.println("X: " + r1);
	}else{
	double r2 = (-b - Math.sqrt(d)) / (2 * a);
	System.out.println("\nRAICES REALES:");
	System.out.println("X1 es: " + r1);
	System.out.println("X2 es: " + r2);
				}
			}
		}
	}
}