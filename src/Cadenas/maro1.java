package Cadenas;

import java.util.Scanner;

public class maro1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[]tabla=new String[5];
		String base = null;
		for (int i=0;i<(tabla.length);i++) // inicializa i a cero i menor que los caracteres de la tabla
		{
			System.out.println("Escriba la palabra número " +(i+1)); //+1 para no poner palabra numero 0
			tabla[i] = teclado.nextLine(); // mete cada String en una tabla
		}
		base = tabla[0]; // primera palabra en posicion 0
		for (int i=0;i<tabla.length;i++)
		{
			if (tabla[i].compareTo(base)>0) // si la palabra compareTo (que cadena es mayor alfameticamente) Compara lo de la tabla con la base si es verdadero mete en base la palabra mayor
			{
				base = tabla[i];
			}
		}
		System.out.println("La cadena alfabéticamente mayor es: " +base);
		teclado.close();
	}
}