import java.util.Scanner;
public class E10{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa la calificación de materia 1 (escala de 1 al 10)");
	double m1 = sc.nextDouble();
	System.out.println("Ingresa la calificación de materia 2 (escala de 1 al 10)");
	double m2 = sc.nextDouble();
	System.out.println("Ingresa la calificación de materia 3 (escala de 1 al 10)");
	double m3 = sc.nextDouble();
	double pr = (m1+m2+m3)/3;
	System.out.println("El promedio general obtenido es: " + pr);
	}
}