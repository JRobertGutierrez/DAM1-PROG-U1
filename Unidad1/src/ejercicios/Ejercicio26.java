package ejercicios;

import java.util.Scanner;

public class Ejercicio26 {
	/**
	 * Calcular si dos n�meros son amigos. A es amigo de B si la suma de sus divisores
	 * (excepto ellos mismos son iguales).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declaramos variables
		int a = 0, b = 0, i = 0, j = 0, sumaA = 0, sumaB = 0;

		// Muestro una de serie de n�meros amigos ya hallados
		System.out.println("Estos n�meros son amigos: (220, 284)(1184, 1210)"
				+ "(6232, 6368)(17296, 18416) y (9363584, 9437056)\n");

		System.out.println("Introduce n�mero A: ");
		a = sc.nextInt();
		System.out.println("Introduce n�mero B: ");
		b = sc.nextInt();

		sc.close();// Cierro Scanner

		for (i = 1; i < a; i++) {

			if (a % i == 0)// Si a dividido entre i da de resto 0 -> Sumamos i a la variable sumaA
				sumaA = sumaA + i;
		} // Mostramos la suma de los divisores de A
		System.out.println("La suma de los divisores del n�mero A es: " + sumaA);

		for (j = 1; j < b; j++) {

			if (b % j == 0)// Si b dividido entre j da de resto 0 -> Sumamos j a la variable sumaB
				sumaB = sumaB + j;
		} // Mostramos la suma de los divisores de B
		System.out.println("La suma de los divisores del n�mero B es: " + sumaB + "\n");

		if (sumaA + i == sumaB + j)// Si la sumaA+i es igual que la sumaB+j -> Mostramos que son amigos
			System.out.println("El n�mero " + a + " y el n�mero " + b + " son amigos");
		else {
			System.out.println("El n�mero " + a + " y el n�mero " + b + " no son amigos");
		}
	}
}