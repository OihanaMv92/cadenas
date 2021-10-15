import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		int num1,num2,suma,producto;
		float cociente;
		System.out.println("Dame el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo numero: ");
		num2 = teclado.nextInt();
		
		
		if(num1!=num2) {
			producto=num1*num2;
			System.out.println("Si son impares el producto es: " + producto);
			
		}
		else  {
			suma=num1+num2;
			System.out.println("La suma de los numeros pares es:" + suma);
			
		}

	}
	}


