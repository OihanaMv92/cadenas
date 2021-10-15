package TABLAS;

import java.util.Scanner;

public class Tabla3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
	
		int[] num= new int[4];
		for(int i=0;i<=3;i++) {
			System.out.println("Ingrese los numeros enteros");
			num[i] = teclado.nextInt();

		}
		for(int i=3;i>=0;i--) { // INTERCAMBIAR NUMEROS
			System.out.println("Los numeros enteros son: " + num[i]);

		}
teclado.close();
	}

}
