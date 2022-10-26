package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
/*Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
 * Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos,
 * la media de los números negativos y el número de ceros que ha introducido el usuario.
 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num, contador=0, pos=0, neg=0, contNeg=0, cer=0;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número y creamos el buble
		
		System.out.println("Por favor, introduce un número positivo o negativo");
		num = lectura.nextInt();

		while (contador<=10) {
						
			contador++;
			
			if (num>=0) {
				
				pos+=num;
				
			} else if (num==0) {
				
				cer++;
				
			} else
				
				pos-=num;
				contNeg++;
			
			System.out.println("Por favor, introduce un número positivo o negativo");
			num = lectura.nextInt();
			
		}
		
		System.out.println("La suma de los números positivos da un total de " + pos);
		System.out.println((contNeg!=0 && ) ? "La media de los números negativos da un total de " + (neg/contNeg):"No has introducido numeros negativos");
		System.out.println("La suma de los ceros da un total de " + cer);

		
		//Cerramos el scanner
		
		lectura.close();

	}

}
