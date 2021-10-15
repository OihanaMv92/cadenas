package Cadenas;

import java.util.Scanner;

public class MayusculaMinuscula
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
		System.out.println("Las dos cadenas serian: " +cadena[0].toLowerCase()+" " +cadena[1].toUpperCase()); //toLowerCase Minusculas y toUpperCase Mayusculas
		teclado.close();

	}

}
