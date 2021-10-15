package Cadenas;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String Frase;
	
		System.out.println("Dame una Frase");
		Frase = teclado.nextLine();
		System.out.println("La longitud de la frase es: "+ Longitud(Frase));
		System.out.println("La longitus de la frase sin espacios es " + Longitud1(Frase));

	}
	public static int Longitud(String a) {

		return (a.length());
		
	}
public static int Longitud1(String frase) {
		int contadorEspacio=0; // Aqui guardo espacios en blanco
		for(int i=0;i<frase.length();i++) { // recorre los caracteres de la frase
			if(frase.charAt(i)==' ') { //charAt Comprueba los espacios 
				contadorEspacio++;
			}
		}
		return(frase.length()-contadorEspacio); // frase contando los caracteres menos los espacios
		
	}

}
