package ejercicios;

public class Ejercicio17 {
	/**
	 * Programa que visualice los 100 primeros n�meros pares.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		System.out.println("\nVersi�n for[1] (pares)\n**********************");
		for (int i = 2; i <= 100; i += 2) {
			System.out.println("El n�mero par es: " + i);
		}
		System.out.println("\nVersi�n for[2] (pares)\n**********************");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println("El n�mero par es: " + i);
		}
		System.out.println("\nVersi�n while (pares)\n*********************");
		int cont = 0;
		int par = 2;
		while (cont < 50) {
			System.out.println("El n�mero par es: " + par);
			cont++;
			par = par + 2;
		}
		System.out.println("\nVersi�n do while (pares)\n************************");
		cont = 0;
		par = 2;
		do {
			System.out.println("El n�mero par es: " + par);
			cont++;
			par = par + 2;
		} while (cont < 50);
	}
}