package TABLAS;

import java.util.Scanner;

public class RellenarTabla2
{

	public static void main(String[] args)
	{
		// MI CODIGO

		Scanner teclado = new Scanner(System.in);
		int[] num= new int[4];
		for(int i=0;i<=3;i++) {
			System.out.println("Ingrese los numeros enteros");
			num[i] = teclado.nextInt();

		}
		for(int i=0;i<=3;i++) {
			System.out.println("Los numeros enteros son: " + num[i]);

		}

		/*
		// TU CODIGO
		Scanner teclado = new Scanner(System.in);
		int tabla2[]=new int[4];
		for (int i=0;i<=3;i++)
		{
			tabla2[i]=0;
		}

		for (int i=0;i<=3;i++)
		{
			System.out.println("Indicar el valor de la tabla en la posición "+i);
			tabla2[i] = teclado.nextInt();
		}
		for (int i=0;i<=3;i++)
		{
			System.out.println(tabla2[i]);
		}
		teclado.close();
	}
		 */


	}

}
