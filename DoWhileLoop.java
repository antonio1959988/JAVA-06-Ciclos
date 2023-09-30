package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main (String[] args) {
		
		/*Do While: Evaluan su expresion en la parte inferior del ciclo, por lo tanto las declaraciones dentro del bloque Do, siempre se ejecutan al menos una vez
		 */
		
		//Cuenta del 1 al 10
		int cuenta = 1;
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta < 0); //Output: 1 (ya que se ejecuta al menos una vez) 
		
		
		//Crear un poblema para un cajero bancario
		/* - El programa me mostrara tres opciones
		 * 1. Consultar saldo
		 * 2. Ingresar dinero
		 * 3. Retirar dinero
		 * 4. Salir
		 * 
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opcion (numero)
		 * - Mostrar al usuario la opcion que eligio y permitir que elija otra opcion
		 * - El usuario puede salir del programa escibiendo 4
		 * 
		 * */
		
		System.out.println("¡Bienvenido al BangoGen!, elije cualquiera de las opciones, para ello escribe el numero que corresponda...");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Salir");
		
		Scanner scan = new Scanner(System.in);
		int opcionSeleccionada;
		
		do {
			opcionSeleccionada = scan.nextInt();
			switch (opcionSeleccionada) {
			case 1:
				System.out.println("Consultar saldo.");
				break;
			case 2:
				System.out.println("Ingresar dinero.");
				break;
			case 3:
				System.out.println("Retirar dinaro.");
				break;
			case 4:
				System.out.println("Salir.");
				break;
			default:
				System.out.println("Elige una opción valida");
			}
		}while(opcionSeleccionada != 4);
		
		scan.close();
	}
}
