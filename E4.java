import java.util.Scanner;
public class E4{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("\t\t--Edad--\t\t");
	System.out.println("Ingrese su año de nacimiento: ");
	int fn = sc.nextInt();
	System.out.println("Ingrese año actual: ");
	int fa = sc.nextInt();
	int edad = (fa-fn);
	System.out.println("Su edad es: " + edad);
	}
}