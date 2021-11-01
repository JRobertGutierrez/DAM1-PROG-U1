package ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
	/**
	 * Programa que visualice si un n�mero introducido por teclado es perfecto. NOTA: Un
	 * n�mero es perfecto si la suma de sus divisores, excepto �l mismo, es igual al
	 * propio n�mero.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int i = 0;
		int suma = 0;
		System.out.println("Algunos n�meros pefectos: 6 - 28 - 496 - 8128 ......");
		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();

		System.out.println(
				"Un n�mero es perfecto si la suma de sus divisores," + " excepto �l mismo, es igual al propio n�mero.\n"
						+ "Dicho de otra forma, un n�mero perfecto es aquel que es amigo de s� mismo.\r\n" + "\r\n"
						+ "As�, 6 es un n�mero perfecto porque sus divisores propios son 1, 2 y 3 y suman 6\r\n"
						+ "		6 = 1 + 2 + 3\r\n" + "		28 = 1 + 2 + 4 + 7 + 14\r\n"
						+ "		496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248\r\n"
						+ "		8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064\n");
		sc.close();// Cierro Scanner
		// Bucle para determinar la suma de todos los n�meros divisores por el n�mero
		// elegido que den como resto 0
		for (i = 1; i < n; i++) {
			if (n % i == 0)
				suma = suma + i;
		}

		if (suma == n)
			System.out.println("-->El n�mero " + n + " es perfecto<--");
		else
			System.out.println("-->El n�mero " + n + " no es perfecto<--");
	}
}
