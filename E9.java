import java.util.Scanner;
public class E9{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double inc = 0.25;
	System.out.println("Sueldo sin incremento:");
	double s = sc.nextDouble();
	double si = s+(s*inc);
	System.out.println("Sueldo con incremento: " + si);
	}
}
