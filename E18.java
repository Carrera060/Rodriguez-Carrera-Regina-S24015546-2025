import java.util.Scanner;
public class E18{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int base = 10;
	
	System.out.println("Duración de la llamada (minutos): ");
	int d = sc.nextInt();
	if (d <=3){
	 System.out.println("El precio total es de $10.00");
	} else {
	 int me = d-3;
	 int total = base + me;
	 System.out.println("El precio total es de $" + total);
		}
	}
}