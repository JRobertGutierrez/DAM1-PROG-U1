package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {
	/**
	 * Programa que nos diga si un n�mero es positivo o negativo.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		float n=0;
		System.out.println("Introduce un n�mero: ");
		n=sc.nextFloat();
		
		if (n>=0)
			System.out.println("El n�mero "+n+" es positivo");
		else
			System.out.println("El n�mero "+n+" es negativo");
		sc.close();
	}
}