package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

/*Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100
 * (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para
 * los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto
 *  El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).
 */

		
		//Declaramos las variables que vamos a utilizar
		
		int numAleatorio = (int)(Math.random()*99)+1, entradaUsuario;
		Scanner lectura = new Scanner (System.in);
		
		//Presentamos el juego al usuario
		
		System.out.println("¡Bienvenido al juego 'el número secreto'!");
		System.out.println("El número se ha generado... ¡empieza a jugar!");
		entradaUsuario = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		while (entradaUsuario!=numAleatorio && entradaUsuario!=-1) {
		
		if (entradaUsuario>0 && entradaUsuario<100) {
			if (entradaUsuario>numAleatorio) {
			
			System.out.println("Estás cerca... el número introducido es mayor que el número generado");
			
		} else if (entradaUsuario<numAleatorio) {
			
			System.out.println("Estás cerca... el número introducido es menor que el número generado");
		}
			
			System.out.println("¡Introduce otro número!");
			entradaUsuario = lectura.nextInt();
			
		} else {
			
			System.out.println("¡Introduce un número dentro del rango!");
			entradaUsuario = lectura.nextInt();
			
		}
		}
		
		if (entradaUsuario!=-1) {
			
			System.out.println("¡Felicidades, has ganado!");
		} else
			System.out.println("¡Has perdido!");

	}

}
