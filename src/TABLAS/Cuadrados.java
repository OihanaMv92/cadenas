package TABLAS;

import java.util.Scanner;

public class Cuadrados
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		int[] num= new int[10];
		int num1=0;

		System.out.println("Dame un numero entero: ");
		num1 = teclado.nextInt();

		for(int i=0;i<=9;i++) {
			num[i]=(num1+i)*(num1+i);
			System.out.println("Tabla["+ i + "] "+num[i]);
		}

	}
		 
}
