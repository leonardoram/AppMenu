package org.menu;

public class Primos {

	public  boolean esPrimo(int numero) // declaramos el metodo esPrimo
	{

		int contador = 2; // iniciamos un contador en 2
		boolean primo = true;

		while ((primo) && (contador != numero)) 
		{
			if (numero % contador == 0)
				primo = false;
			contador++;
		}

		return primo;
	}
	

	public int Primo_limites(int rInicial, int rFinal )
   {	
		//boolean primo=false;
		int aux=0;
		int num=0;
		
		for(int i = rInicial;i <= rFinal;i++){
			
			for(int j=1; j < i; j++)
			{
				if(i % j == 0)
				{					
					aux++;
				}
				if(aux == 2)
				{
					num=i;
				}
		    }    
		 }
		return num;
   	}
	
	
}
		       


		
