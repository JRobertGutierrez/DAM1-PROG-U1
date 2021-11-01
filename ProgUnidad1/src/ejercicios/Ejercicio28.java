package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio28 {
	/**
	 * Programa que lea n�meros de teclado (hasta que se pulse 0) y que visualice la suma
	 * de los n�meros impares introducidos. Adem�s voy a ir almacenando los n�mero
	 * introducidos en un ArrayList para despu�s mostrarlos
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0, cont = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();// Creo un ArrayList para ir almacenando los n�meros

		System.out.println("Introduce un n�mero: ");
		n = sc.nextInt();

		while (n != 0) {
			numeros.add(n);// A�ado el n�mero al ArrayList
			if (n % 2 != 0)// Si la division de n entre 2 no da de resto 0 es impar
				cont++;
			System.out.println("Introduce otro n�mero: ");
			n = sc.nextInt();
		}

		Collections.sort(numeros);// Ordeno el ArrayList
		System.out.println("El total de n�meros introducidos son " + numeros.size());
		System.out.println("Los n�meros introducidos son: " + numeros);// Muestro el contenido del ArrayList
		System.out.println("La cantidad de n�meros impares son: " + cont);
		sc.close();
	}
}
