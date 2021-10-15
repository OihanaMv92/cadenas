package Cadenas;

import java.util.Scanner;

public class Intercala
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;
		System.out.println("Dame una cadena ");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena ");
		cadena2 = teclado.nextLine();

		for(int i=0;i<cadena1.length()||i<cadena2.length();i++) {
			if(i<cadena1.length()) {
				System.out.print(cadena1.charAt(i));
			}
			if(i<cadena2.length()) {
				System.out.print(cadena2.charAt(i));
			}
		}

	}
}
