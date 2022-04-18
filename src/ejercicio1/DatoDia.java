package ejercicio1;


import java.util.Scanner;

public class DatoDia {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String dia;
		System.out.println("Intruduzca un día de la semana.");
		dia = sc.nextLine();
		System.out.println("\nAsignatura que toca en la primera hora del día\n");

		switch (dia) {
		case "lunes":
			System.out.println("Métodos numericos");
			break;
		case "martes":
			System.out.println("Diseño Web");
			break;
		case "miercoles":
			System.out.println("Paradigma de Programación");
			break;

		case "jueves":
			System.out.println("Programación de sistemas");
			break;
		case "viernes":
			System.out.println("Bases de Datos");
			break;
		case "sabado":
		case "sábado":

		case "domingo":
			System.out.println("¡Ese día no hay clase!");
			break;
		default:
			System.out.println("El día introducido no es correcto.");

		}
	}

}