package Cadenas;

import java.util.Scanner;

public class subcadenas2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int posicion;
		System.out.println("Escriba un texto: ");
		cadena = teclado.next();
		System.out.println("Indique posicion: ");
		posicion = teclado.nextInt();
		System.out.println (cadena.substring((cadena.length()-posicion),cadena.length()));
		
		System.out.println("El final de la cadena tiene " + cadena.length());

	}


}
