package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
	/**
	 * Programa que calcule la suma de los N primeros n�meros naturales, siendo N un
	 * n�mero que el usuario introduce por teclado.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();
		int suma = 0;

		for (int i = 1; i <= n; i++)
			suma = suma + i;
		System.out.println("La suma de los "+n+" primeros n�meros naturales es: " + suma);

		sc.close();
	}
}