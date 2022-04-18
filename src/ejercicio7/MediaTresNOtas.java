package ejercicio7;

import java.util.Scanner;

public class MediaTresNOtas {
	static Scanner nota1;
	static Scanner nota2;
	static Scanner nota3;
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in)) {
			System.out.println("******Este programa calcula la media de tres notas.*****\n");
			
			System.out.print("Por favor, introduzca la primera nota:\n ");
			Double nota1 =scn.nextDouble();
			
			System.out.print("Ahora introduzca la segunda nota:\n");
			Double nota2 =scn.nextDouble();
			
			System.out.print("Por último introduzca la tercera nota:\n ");
			Double nota3 = scn.nextDouble();
			double media = (nota1 + nota2 + nota3) / 3;

			System.out.printf("La media es %.2f\n", media);
		}
	}

}
