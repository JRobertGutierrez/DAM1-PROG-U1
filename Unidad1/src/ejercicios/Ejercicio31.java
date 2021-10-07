package ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
	/**
	 * Programa que lea n�meros de teclado (hasta que se pulse 0) y que visualice cual
	 * fue el n�mero mayor de la secuencia
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un n�mero: ");
		int numero = sc.nextInt();
		int mayor = numero;

		while (numero != 0) {
			if (numero > mayor)
				mayor = numero;
			System.out.println("Introduce un n�mero: ");
			numero = sc.nextInt();
		}
		System.out.println("El n�mero mayor es :" + mayor);

		sc.close();
	}
}
