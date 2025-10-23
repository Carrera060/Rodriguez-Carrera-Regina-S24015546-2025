import java.util.Scanner;
public class E11{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
	System.out.println("\t\t\tCúal de los 3 números es el mayor?");

	System.out.println("Ingresa el primer número: ");
	a = sc.nextInt();
	System.out.println("Ingresa el segundo número: ");
	b = sc.nextInt();
	System.out.println("Ingresa el tercer número: ");
	c = sc.nextInt();	

	if (a > b) {             
            if (a > c) {         
                System.out.println("El número mayor es: " + a);
            } else {            
                System.out.println("El número mayor es: " + c);
            }
        } else {                
            if (b > c) {         
                System.out.println("El número mayor es: " + b);
            } else {            
                System.out.println("El número mayor es: " + c);
            }
        }
    }
}