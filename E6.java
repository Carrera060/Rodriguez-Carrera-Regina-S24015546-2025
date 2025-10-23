import java.util.Scanner;
public class E6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Número total de estudiantes en el grupo: ");
	double total = sc.nextDouble();
	System.out.println("Cantidad de mujeres:");
	int m = sc.nextInt();
	System.out.println("Cantidad de hombres:");
	int h = sc.nextInt();
	double pm = (m/total)*100;
	System.out.println("Porcentaje de mujeres en el grupo: " + pm);
	double ph = (h/total)*100;
	System.out.println("Porcentaje de hombres en el grupo: " + ph);
	}
}