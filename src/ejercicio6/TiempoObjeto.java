 package ejercicio6;

import java.util.Scanner;

public class TiempoObjeto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo del tiempo de caída de un objeto.");
		System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
		
		Double horas = scan.nextDouble();
		final double grados = 9.81; 
		double segundos = Math.sqrt(2*horas/grados);
		
		System.out.printf("El objeto tarda %.2f segundos en caer.\n", segundos);
		

	}

}
