/**@author Jan  */
//Hola
package Ed; /**Este es el paquete. */

import java.util.Scanner;

/** Esta clase ofrecec un método estático para sumar o restar numeros */
public class CalculadoraSimple { 
	
		public static double sumar(double a, double b) {
		return a + b;	/** Realiza la funcion de la suma. */
		}
		
		public static double restar(double a, double b) {
			return a - b;	/** Realiza la funcion de la resta. */
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in); /** Llama al scaner para poder interactuar con el sistema.*/
			System.out.println("Calculadora Simple:");	/** Imprime el titulo de la clase */
			System.out.print("Introduce el primer número: ");	/** Pide el primer numero para luego tener el numero con un double. */
			double numero1 = scanner.nextDouble();      
			System.out.print("Introduce el segundo número: ");	/** Pide el segundo numero para luego tener el numero con un double. */
			double numero2 = scanner.nextDouble();      
			double resultadoSuma = sumar(numero1, numero2);	/** Llamamos a las funciones. */
			double resultadoResta = restar(numero1, numero2);
			System.out.println("Resultado de la suma: " + resultadoSuma); /** Imprime resultados. */
			System.out.println("Resultado de la resta: " + resultadoResta);
			scanner.close();
			}
		}