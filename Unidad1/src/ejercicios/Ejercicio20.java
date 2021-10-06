package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
	/**
	 * Programa que lea tantos n�meros por teclado como el usuario desee (Se termina
	 * introduciendo el n�mero 0) y que nos diga cuantos n�meros son pares y cuantos
	 * positivos.
	 * 
	 * @author Robert G
	 **/
	public static void main(String[] args) {

		int numero = 0, contpares = 0, contpositivos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();

		while (numero != 0) {

			if (numero % 2 == 0) {
				contpares++;
			}
			if (numero > 0) {
				contpositivos++;
			}

			System.out.println("Introduce un n�mero: ");
			numero = sc.nextInt();
		}

		System.out.println("El n�mero de pares es: " + contpares);
		System.out.println("El n�mero de positivos es: " + contpositivos);

		sc.close();
	}
}