package ejercicios;
import java.util.Scanner;

public class Ejercicio11 {
/**
 * Programa que nos diga cu�l es el mayor de tres n�meros introducidos por teclado.
 * 
 * @author Robert G
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		// Pedimos que el usuario introduzca dos numeros
		System.out.println("Dame un n�mero");
		n1 = sc.nextInt();
		System.out.println("Dame otro n�mero");
		n2 = sc.nextInt();
		System.out.println("Dame otro n�mero");
		n3 = sc.nextInt();
		System.out.println("*************************************");
		if (n1 == n2 && n1 == n3)
			System.out.println("Los 3 n�meros son iguales");
		else

		if (n1 > n2 && n1 > n3)
			System.out.println("El mayor es el n�mero " + n1);
		else if (n2 > n1 && n2 > n3)
			System.out.println("El mayor es el n�mero " + n2);
		else if (n3 > n1 && n3 > n2)
			System.out.println("El mayor es el n�mero " + n3);

		sc.close();
	}
}