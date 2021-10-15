package Cadenas;

import java.util.Scanner;

public class CincoNombres
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[] cadena= new String[5];
		
		for (int i=0;i<cadena.length;i++) // Realizar bucle para pasar por todas las posiciones
		{
			System.out.println("Escriba un nombre  " ); // el i+1 es por que el usuario empieza contar con 1. asi meten 5 palabras.
			cadena[i] = teclado.nextLine(); // lee la cadena y en cada vuelta mete la cadena en una posicion.
		
		}
		for(int j=0;j<5;j++) {
		System.out.println("Los nombres introducidos son: " + cadena[j]); // Imprimir los nombres.
		}

	}
	

}
