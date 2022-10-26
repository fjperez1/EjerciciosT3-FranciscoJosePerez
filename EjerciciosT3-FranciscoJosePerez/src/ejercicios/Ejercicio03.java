package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int suma = 0, num = 0, contador = 0, media=0;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número y creamos el buble
		
		System.out.println("Por favor, introduce un número; hasta ahora has introducido " + contador + " numeros");
		num = lectura.nextInt();
		
		while (num>=0) {
		
			contador++;
			suma += num;
			media = (suma)/contador;
			System.out.println("Por favor, introduce un número; hasta ahora has introducido " + contador + " numeros");
			num = lectura.nextInt();
			
		}
		
		System.out.println("La media de los números introducidos es " + media);
		
		//Cerramos el scanner
		
		lectura.close();
		
		

	}

}
