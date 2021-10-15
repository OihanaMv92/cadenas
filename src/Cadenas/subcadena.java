package Cadenas;

import java.util.Scanner;

public class subcadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int longitud, posicion;
		System.out.println("Escriba un texto:");
		cadena = teclado.next();
		System.out.println("Indique posición en la que comienza la subcadena:");
		posicion = teclado.nextInt();
		System.out.println("Indique la longitud de la subcadena:");
		longitud = teclado.nextInt();
		System.out.println(subcadena (cadena,posicion,longitud));
		teclado.close();
		}
		public static String subcadena(String cadena, int posicion, int longitud)
		{
		return (cadena.substring(posicion,(posicion+longitud)));
		}
}
