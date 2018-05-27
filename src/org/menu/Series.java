package org.menu;

public class Series {
	
	public boolean Palindromo(String cadena)
	{
		boolean isPalindromo = true;	//inicializamos el valor isPalindromo como tru 
		cadena=cadena.replace(" ","");	// esto es para remplazar los espacios en alguna cadena
		int mitadCadena = cadena.length()/2; // se parte la cadena por mitada para comparar ambas cadenas 
		
		for(int cont =0; cont < mitadCadena; cont++) // comparamos de am
		{
			if(cadena.charAt(cont)!=cadena.charAt(((cadena.length()-1)-cont)))
			{
				isPalindromo = false;
			}
		}
	
		return isPalindromo;
		
	}
	
	public String Serie1_100() // metodo 
	{
		
		String resultado = "";	// se crea la variable resultado de tipo string
		
		for(int cont =0; cont<=100; cont++) // se hace un ciclo for para llenar el vector 
		{
			resultado = resultado + cont ; // se llena el vector con la variable cont y se guarda en la direccion del vector 
		}
		
		return resultado; // regresa el resultado a donde a la clase que lo mando llamar 
		
	}
	
	public int[] Serie1_100v() // otro metodo, que en este caso retorna un arreglo de e
	{
		int[] v = new int [100];
		for(int cont = 0; cont < 100; cont++) 
		{
			
			v[cont]=cont+1;
		}
		return v;
		
	}


}
