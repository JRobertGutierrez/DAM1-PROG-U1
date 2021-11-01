package ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
	/**
	 * Programa que lea n�meros de teclado (hasta que se pulse 0) y que visualice la suma
	 * de los n�meros pares si el primer n�mero introducido fue un n�mero impar, y que
	 * visualice la suma de los n�meros impares introducidos si el primer n�mero
	 * introducido fue un n�mero par
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Declaro variables
		int numero = 0, par = 0, impar = 0, primero = 0;

		System.out.println("Introduce un n�mero: ");
		primero = sc.nextInt(); // Leo el primer n�mero

		if (primero % 2 == 0) {// Si el primer n�mero es par sumamos impares

			System.out.println("Introduce otro n�mero: ");
			numero = sc.nextInt(); // Leo el n�mero

			while (numero != 0) {// Si es distinto de 0 almaceno en impar la suma del numero

				if (numero % 2 != 0)// Compruebo que el n�mero es impar
					impar = impar + numero;
				// Pido otro n�mero
				System.out.println("Introduce otro n�mero: ");
				numero = sc.nextInt(); // Leo el n�mero
			} // fin while sumar impares
				
			System.out.println("La suma de los n�meros impares es: " + impar);
		} // fin if

		else {// En caso contrario es impar y sumamos pares
		
			System.out.println("Introduce otro n�mero: ");
			numero = sc.nextInt(); // Leo el n�mero

			while (numero != 0) {// Si es distinto de 0 almaceno en par la suma del numero
			
				if (numero % 2 == 0)// Compruebo que el n�mero sea par
					par = par + numero;
				// Pido otro n�mero
				System.out.println("Introduce otro n�mero: ");
				numero = sc.nextInt(); // Leo el n�mero
			} // fin while sumar pares
				
			System.out.println("La suma de los n�meros pares es: " + par);
		} // fin else
		sc.close();
	}
}
