import java.util.Scanner;
public class E3{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese su edad:");
	double edad = sc.nextDouble();
	double puls = (220-edad)/10;
	System.out.println("Sus pulsaciones cada 10 segundos son: " + puls);
	}
}