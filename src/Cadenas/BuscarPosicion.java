package Cadenas;


import java.util.Scanner;

public class BuscarPosicion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String Frase;
		char Caracter;
		int a=0;
		Boolean encontrar= false;
	
		System.out.println("Dame una Frase");
		Frase = teclado.nextLine();
		System.out.println("Dame un caracter");
		Caracter = teclado.next().charAt(0); // el primer caracter lo añade a la posicion cero
		while((encontrar==false)&&(a<Frase.length())){ // bucle mientras encontrar caracter sea falso y el numero sea menor que la longuitud de la frase
		if(Frase.charAt(a)==Caracter) { //Encontrar el caracter a en la frase y compara que sea igual que el caracter que yo escrito
			System.out.println("El caracter que estas buscando esta en la posicion " + a);
			encontrar=true; // Cuando encuentra el caracter y para el bucle
		}
		a++; //mientras da vueltas en el while va sumando 1 hasta que encuentra el caracter
			
		}


	}

}
