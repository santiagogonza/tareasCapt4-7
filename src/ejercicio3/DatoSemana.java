package ejercicio3;

import java.util.Scanner;

public class DatoSemana {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	
	 String dia;
	 
	 System.out.println("ingrese un número de 1-7");
	 int seman=sc.nextInt() ;
	 
	 switch(seman) {
     case 1:
       dia = "lunes";
       break;
     case 2:
       dia = "martes";
       break;
     case 3:
       dia = "miércoles";
       break;
     case 4:
       dia = "jueves";
       break;
     case 5:
       dia = "viernes";
       break;
     case 6:
       dia = "sábado";
       break;
     case 7:
       dia = "domingo";
       break;
     default:
       dia = "Por favor introduce un número del 1 al 7";
   
   }
   
   System.out.println(dia);
   System.out.println("Fin del programa");

	}
}