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
		
		int num, contador=1, pos=0, cer=0;
		double neg = 0, contNeg=0;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número y creamos el buble
		
		while (contador<=10) {
						
			System.out.println("Por favor, introduce un número positivo o negativo");
			num = lectura.nextInt();
			contador++;
			
			if (num>0) {
				
				pos+=num;
				
			} else if (num==0) {
				
				cer++;
				
			} else if (num<0)
				
				neg+=num;
				contNeg++;
			
		}
		
		System.out.println("La suma de los números positivos da un total de " + pos);
		if (contNeg!=0 && neg!=0) {
			
			System.out.println("La media de los números negativos da un total de " + (neg/contNeg));
		
		}else
			
			System.out.println("No has introducido números negativos");

		
		System.out.println("Has introducido un total de " + cer + " ceros");

		
		//Cerramos el scanner
		
		lectura.close();

	}

}
