package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
	/**
	 * Calcular todos los divisores de un n�mero introducido por teclado.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) // Si el n�mero dividido entre i da de resto 0
				System.out.println(i + " es divisor");// Muestra el valor de i (divisor)
		}

		sc.close();
	}
}