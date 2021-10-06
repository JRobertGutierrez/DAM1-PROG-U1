package ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
	/**
	 * Programa que lea una opci�n del men� siguiente y que visualice la operaci�n
	 * correspondiente con dos n�meros introducidos por teclado:
	 * 
	 * Introduzca la operaci�n a realizar: 1. Sumar dos n�meros. 2. Restar dos
	 * n�meros. 3. Multiplicar dos n�meros. 4. Dividir dos n�meros 5. Hacer A m�dulo
	 * de B con los dos n�meros.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		// Pedimos que el usuario introduzca dos numeros
		System.out.println("Dame el n�mero 1");
		float a = sc.nextFloat();
		System.out.println("Dame el n�mero 2");
		float b = sc.nextFloat();
		System.out.println("*************************************");
		do {
			// Mostramos el menu por pantalla
			System.out.println("Introduzca la operaci�n a realizar");
			System.out.println("1. Sumar dos n�meros");
			System.out.println("2. Restar dos n�meros");
			System.out.println("3. Multiplicar dos n�meros");
			System.out.println("4. Dividir dos n�meros");
			System.out.println("5. Resto de uno entre otro");
			System.out.println("6. Para salir del programa");
			System.out.println("*************************************");

			// Pedimos la opci�n del men�
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("La suma entre " + a + " y " + b + " es " + (a + b) + "\n");
				break;
			case 2:
				System.out.println("La resta entre " + a + " y " + b + " es " + (a - b) + "\n");
				break;
			case 3:
				System.out.println("La multiplicaci�n entre " + a + " y " + b + " es " + (a * b) + "\n");
				break;
			case 4:
				System.out.println("La divisi�n entre " + a + " y " + b + " es " + (a / b) + "\n");
				break;
			case 5:
				System.out.println("El resto entre " + a + " y " + b + " es " + (a % b) + "\n");
				break;
			case 6:// Opci�n para salir del men�
				System.out.println("Has salido del programa, hasta pronto!!\n");
				break;
			default:
				System.out.println("La opci�n es incorrecta\n");
				break;
			}
		} while (opcion != 6);
		sc.close();
	}
}