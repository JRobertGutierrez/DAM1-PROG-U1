package ejercicios;

import java.util.Scanner;

public class Ejercicio34_2 {
	/**
	 * Programa que genera una lista de los N primeros n�meros primos, siendo N el dato
	 * de entrada - Genera n�meros primos hasta el que hemos introducido.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce n�mero: ");
		int N = sc.nextInt();
		int contador = 0; // va a contar los N primos
		int numero = 2;
		boolean primo = false;

		while (contador != N && numero < N) {// Mientras contador distinto a N y n�mero menor a N
			primo = true;// Si es primo
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0)
					primo = false;
			}
			if (primo) {
				contador++;
				System.out.print(numero + " ");
			}
			numero++;
		}
		sc.close();
	}
}
