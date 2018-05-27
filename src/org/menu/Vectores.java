package org.menu;

import java.util.Random;

public class Vectores {
	
	
	public int suma_vector (int[] vector) 
	{
		int suma = 0;
		for(int cont =0; cont< vector.length;cont++) 
		{
			suma=suma+vector[cont];
		}
		
		return suma;
		
	}
	
	public String[] Numeros2Meses(int [] numeros) // se crea nuevo metodo que pide un vector de enteros y regresa un vector de tipo string
	{
		String[] meses = new String[numeros.length];
		
		for(int cont =0; cont<numeros.length;cont++)
		{
			switch(numeros[cont])
			{
			case 1: meses[cont]="Enero";
			break;
			case 2: meses[cont]="Febrero";
			break;
			case 3: meses[cont]="Marzo";
			break;
			case 4: meses[cont]="Abril";
			break;
			case 5: meses[cont]="Mayo";
			break;
			case 6: meses[cont]="Junio";
			break;
			case 7: meses[cont]="Julio";
			break;
			case 8: meses[cont]="Agosto";
			break;
			case 9: meses[cont]="Septiembre";
			break;
			case 10: meses[cont]="Octubre";
			break;
			case 11: meses[cont]="Noviembre ";
			break;
			case 12: meses[cont]="Dciembre ";
			break;
			default : meses[cont] = "NA";
			break;
			
			}
		}
		
		return meses;
	}
	
	public int[] AleatoriosVector(int cantidad)
	{
		int [] aleatorios = new int[cantidad];
		
		Random rnd = new Random(System.nanoTime());
		
		int numAG =0 ;
		int cont =0;
		while(cont<cantidad)
		{
			aleatorios[cont] = rnd.nextInt(10);
			cont++;
		}
		
		return aleatorios;
	}
	
	public int[] Aleatorios_suma(int[] arreglo1, int[]arreglo2)
	{
		
		int [] alsuma = new int[arreglo1.length];
		for(int cont=0 ; cont < alsuma.length; cont++) 
		{
			alsuma[cont] = arreglo1[cont] + arreglo2[cont];
		}
		
		return alsuma;
	}
	
<<<<<<< HEAD
	public int[] sumaTresVectores(int[] vec1,int [] vec2,int [] vec3) 
=======
	public int[] sumaTresVectores(int[] vec1,int [] vec2,int [] vec3) // ejercicio de suma de 3 vectores 
>>>>>>> branch 'master' of https://github.com/leonardoram/AppMenu.git
	{
		int [] vecSuma = new int [vec1.length];
		
		int cont =0 ;
		while(cont < vecSuma.length)
		{
			vecSuma[cont]=vec1[cont]+vec2[cont]+vec3[cont];
			cont++;
		}
		
		return vecSuma; 
	}
	
	
	

}
