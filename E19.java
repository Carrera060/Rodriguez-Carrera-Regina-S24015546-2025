import java.util.Scanner;
public class E19{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingresa el presupuesto total del hospital: ");
	double pt = sc.nextDouble();
	
	double gine = pt * 0.40;
	double tr = pt * 0.30;
	double pd = pt * 0.30;

	System.out.println("Dinero para ginecología: "+ gine);
	System.out.println("Dinero para traumatología: "+ tr);
	System.out.println("Dinero para pediatría: "+ pd);
	}
}