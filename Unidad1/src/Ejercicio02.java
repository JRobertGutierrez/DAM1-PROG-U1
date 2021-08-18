import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que calcule el n�mero de n�mero de kil�metros correspondientes a un
 * n�mero N de millas marinas introducidas por teclado. (El n�mero de metros de
 * una milla marina es de 1852).
 * 
 * @author Robert
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaramos variables
		float km = 0.0f, kmR = 0.0f;
		float millas = 0.0f;

		try {// Controlo errores para que no caiga el programa
			// Pedimos que el usuario introduzca las millas
			Scanner s = new Scanner(System.in);
			System.out.println("Introduzca el n�mero de millas para pasar a kil�metros:");

			millas = s.nextFloat();
			s.close();// Cierro Scanner

			// Pasamos las millas a kil�metros
			km = (millas * 1852) / 1000;
			
			// Redondeo a 2 decimales con Math.round
			//kmR = (float) (Math.round(km * 100.0) / 100.0);
			
			// Redondeo a 3 decimales con BigDecimal y RoundingMode
			BigDecimal bd = new BigDecimal(km).setScale(3, RoundingMode.HALF_UP);
			kmR = (float) bd.doubleValue();
			
			// Mostramos el resultado final
			System.out.println(millas + " Millas son " + kmR + " kil�metros.");
		} catch (InputMismatchException e) {// Informo de la excepci�n
			System.out.println(
					"Debes poner un n�mero entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepci�n es esta --> " + e.getClass().getName());
		}
	}
}
