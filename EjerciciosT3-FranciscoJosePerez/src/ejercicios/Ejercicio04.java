package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num, par, resto;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número y creamos el buble
		
		System.out.println("Por favor, introduce un número para saber si es par o impar");
		num = lectura.nextInt();

		while (num!=0) {
						
			resto=num%2;
			if (resto==0) {
				par=1;
			}else
				par=0;
						
			System.out.println(par==1 ? "El número introducido es par":"El número introducido es impar");
			System.out.println("Por favor, introduce un número para saber si es par o impar");
			num = lectura.nextInt();
			
		}
		
		//Cerramos el scanner
		
		lectura.close();

	}

}
