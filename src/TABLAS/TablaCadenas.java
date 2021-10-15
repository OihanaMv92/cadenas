package TABLAS;

import java.util.Scanner;

public class TablaCadenas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[] cadena= new String[10];
		
		for (int i=0;i<cadena.length;i++) // Realizar bucle para pasar por todas las posiciones
		{
			System.out.println("Escriba una cadena  " ); 
			cadena[i] = teclado.nextLine(); // lee la cadena y en cada vuelta mete la cadena en una posicion.
		
		}
		for(int j=0;j<10;j++) {
		System.out.println("Las cadenas introducidas son: " + cadena[j]); // Imprimir los nombres.
		}

	}
	


	}


