package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
	/**
	 * Programa que nos diga cu�l es el mayor de dos n�meros introducidos por
	 * teclado.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Pedimos que el usuario introduzca dos numeros
		System.out.println("Dame un n�mero");
		int a = sc.nextInt();
		System.out.println("Dame otro n�mero");
		int b = sc.nextInt();
		System.out.println("*************************************");

		if (a > b)
			System.out.println("El n�mero "+a+" es mayor que el n�mero "+b);
		if (a < b)
			System.out.println("El n�mero "+b+" es mayor que el n�mero "+a);
		if (a == b)
			System.out.println("El n�mero "+a+" es igual que el n�mero "+b);
		sc.close();
	}
}