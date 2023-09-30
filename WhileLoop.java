package loops;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		/* While. El ciclo While ejecuta continuamente un bloque de código hasta que se cumpla una condición dada. 
		 * while (expresion){
		 * 	//bloque de código a ejecutar
		 * 	(contador - iterador)
		 * }*/
		/*
		int cuenta = 1;
		while (cuenta < 11) {
			System.out.println("La cuenta es de: " + cuenta);
			cuenta++;
		}
		*/
		
		int cuenta = 0;
		while (cuenta < 11) {
			cuenta++;
			System.out.println("La cuenta es de: " + cuenta);
		}
		
		//crear un programa que solicite al usuario un numero, dicho numero sera tomado como el numero final de una cuenta. Dicha cuenta inicia en 1, debe mostrar en consola la cuenta del 1 hasta el numero proporcionado.
		//1. Importar un scanner e implementaarlo
		//2. Un mensaje para darle contexto al usuario
		//3. Almacenar el valor del usuario en una variable
		//4. Guardar en variable un numero inicializador. El numero que inicia la cuenta (1)
		//5. Implementar el ciclo while
		//6. Mostrar en consola el resultado
		
		//1. Crear e Importar el scanner
		Scanner scan = new Scanner(System.in);
		
		//2
		System.out.println("Escribe un numero que servira como numero final de una cuenta: ");
		
		//3.
		int numeroFinal = scan.nextInt();
		scan.close();
		
		//4.
		int numeroInicial = 1;
		
		//5.
		while (numeroInicial <= numeroFinal) {
			System.out.println("La cuenta va en " + numeroInicial);
			numeroInicial++;
		}
		
		
	}
}
