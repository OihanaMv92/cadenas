package Cadenas;

import java.util.Scanner;

public class Mayor
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[]tabla=new String[5]; // tabla de cadenas.
		String base = null; // cadena auxiliar para realizar comparaciones
		for (int i=0;i<(tabla.length);i++) // Realizar bucle para pasar por todas las posiciones
		{
			System.out.println("Escriba la palabra número " +(i+1)); // el i+1 es por que el usuario empieza contar con 1. asi meten 5 palabras.
			tabla[i] = teclado.nextLine(); // lee la cadena y en cada vuelta mete la cadena en una posicion.
		}
		base = tabla[0]; //le damos el valor de la primera cadena 0 que es la primera posicion.
		for (int i=0;i<tabla.length;i++) 
		{
			if (tabla[i].compareTo(base)>0) //si tabla i es mayor que base alfabeticamente.
			{
				base = tabla[i]; // en base esta la cadena mas grande
			}
		}
		System.out.println("La cadena alfabéticamente mayor es: " +base);
		teclado.close();
	}
}
