package vectores;

import java.util.Vector;

public class Vectores
{

	public static void main(String[] args)
	{
		int i; 
		Vector<Integer> v=new Vector<Integer>(); // INTEGER ES EL TIPO ENTERO, DECLARAMOS EL CONSTRUCTOR Y AL SER FUNCION PARENTESIS POR QUE ESTA VACIO,// Float Double String
		for(i=0;i<30;i++) 
		{ v.addElement(i); // AÑADIR ELEMENTOS AL VECTOR (AÑADIMOS LA I)
		} 
		System.out.println(v); // Y EN IMPRIMIR PONEMOS LA V QUE ES EL CONSTRUCTOR.
	}

}
