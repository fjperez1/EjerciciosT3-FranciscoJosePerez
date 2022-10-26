package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
//hago el programa.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos
 * de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se
 * mostrará: la suma de todas las edades introducidas, la media, el número de alumnos y
 * cuántos son mayores de edad.
 */
		
		//Declaramos las variables que vamos a utilizar
		
		int edad=0, suma=0, numAlumnos=0, numAlumnosMayores=0;
		double media;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número y creamos el buble
		
		System.out.println("Por favor, introduce la edad del alumno");
		edad = lectura.nextInt();
		
		while (edad>=0) {
						
			suma+=edad;
			numAlumnos++;
			
			
			if (edad>=18) {
				
				numAlumnosMayores++;
				
			}
			
			System.out.println("Por favor, introduce la edad del alumno");
			edad = lectura.nextInt();
			
		}
		
		System.out.println("La suma de las edades introducidas da un total de " + suma);
		System.out.println("La media de las edades introducidas da un total de " + (suma/numAlumnos));
		System.out.println("Has introducido un total de " + numAlumnos + " alumnos");
		System.out.println("Has introducido un total de " + numAlumnosMayores + " alumnos mayores");

		//Cerramos el scanner
		
		lectura.close();

	}

}