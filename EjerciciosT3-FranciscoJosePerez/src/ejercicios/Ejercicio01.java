package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int suma = 0, num = 0;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número y creamos el buble
		
		while (num>=0) {
			
			System.out.println("Por favor, introduce un número");
			num = lectura.nextInt();
			suma += num;
			
		}
		
		System.out.println("La suma de los números introducidos da un total de " + suma);
		
		//Cerramos el scanner
		
		lectura.close();
		

	}

}
