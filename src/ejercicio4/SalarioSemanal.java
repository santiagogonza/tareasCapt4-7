package ejercicio4;

import java.util.Scanner;

public class SalarioSemanal {

	public static void main(String[] args) {
		Scanner sc =new 	Scanner(System.in);
		int sueldoSemanal;

	    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
	    int horasTrabajadas = sc.nextInt();
	    
	    if (horasTrabajadas <= 40) {
	      sueldoSemanal = 12 * horasTrabajadas;
	    } else {
	      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
	    }
	    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");

	}

}
