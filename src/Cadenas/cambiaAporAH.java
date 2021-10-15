package Cadenas;

import java.util.Scanner;

public class cambiaAporAH
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String texto1, texto2; // declaramos 2 cadenas
		System.out.println("Escriba un texto:");
		texto1 = teclado.nextLine(); // metemos el texto 1
		texto2 = (texto1.replaceAll("a","ha")); // y aqui cambia el caracter a por el caracter 2 y lo mete en texto 2.
		System.out.println(texto2); // imprimimos texto 2.
		//System.out.println(texto1); // ver cadena 2.
		teclado.close();
	}
}