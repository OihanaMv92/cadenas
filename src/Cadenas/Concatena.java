package Cadenas;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[] cadena= new String[2];

		for (int i=0;i<cadena.length;i++) // Realizar bucle para pasar por todas las posiciones
		{
			System.out.println("Escriba un cadena  " ); // el i+1 es por que el usuario empieza contar con 1. asi meten 5 palabras.
			cadena[i] = teclado.nextLine(); // lee la cadena y en cada vuelta mete la cadena en una posicion.

		}
		System.out.println("Las dos cadenas serian: " +cadena[0]+" " +cadena[1]);
		teclado.close();
		//System.out.println(String.format("Las dos cadenas serian: \"%s\"\"%s\"",cadena[0],cadena[1]));
	}
	
}
