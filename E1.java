import java.util.Scanner;
public class E1{
	public static void main(String args[]){
	Double pie=3.28084, resultado;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce los metros que quiere convertir a pulgadas:");
	Double metros=sc.nextDouble();
	resultado=metros*pie;
	System.out.print("metros: " + metros + " Pies: " + resultado);
	}
}
