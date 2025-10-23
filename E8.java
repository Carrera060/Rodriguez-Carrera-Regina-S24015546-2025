import java.util.Scanner;
public class E8{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double pr = .02;
	System.out.println("Capital invertido:");
	double c = sc.nextDouble();
	double cg = c+(c*pr);
	System.out.println("Dinero ganado después de un mes: " + cg);
	}
}