package Cadenas;

import java.util.Scanner;

public class Copiar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String texto1, texto2; // declaramos 2 cadenas
		System.out.println("Escriba un texto:");
		texto1 = teclado.nextLine(); // metemos el texto 1
		texto2=texto1; // en el texto 2 metemos el texto 1
		System.out.println(texto2);

	}

}
