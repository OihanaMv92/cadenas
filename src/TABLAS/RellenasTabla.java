package TABLAS;

import java.util.Scanner;

public class RellenasTabla
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int[] pares= new int[20];
		for(int i=0;i<19;i++) {
			pares[i]=(i+1)*2;
		}
		for(int i=0;i<19;i++) {
			System.out.println("Los numeros pares son :" + pares[i]);
		}

	}

}
