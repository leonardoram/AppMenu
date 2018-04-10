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

//	public boolean Primo_sup(int numero )
//   {
//		int i,j;
//		boolean esPrimo;
//		int rInicial=2;								//Rango inicial, este debe ser mayor de 1.
//		int rFinal = 200;							//Rango final.
//		
//			for(i = rInicial;i <= rFinal;i++){	  //recorro ciclo tantas veces como necesite(<= es para incluir el valor de rFinal).
//				esPrimo=true;						// i es primo hasta que se demuestre lo contrario, jejejejeje.
//		       for(j = 2;j < i;j++){
//		    	   								//no coloque j = 1 porque ya sabemos que todo numero es divisible por 1.
//		    	   									/*j < i es para no incluir el numero a evaluar, pues todo numero es divisible
//		       										por si mismo.*/
//		    	   if(i % j == 0)
//		    	   {							//Si además del 1 y el mismo hay otro divisor, ya no es primo.
//		    		   							//% devuelve el residuo de i/j		          esPrimo = false;//se demostró que i no es primo.
//		    	   }
//		       }
//
//		      if(esPrimo){//Si es primo lo imprimo.
//		        System.out.println(i+"\n");
//		       }
//		  }
//	}
    	
    
	
	public String primolim(int lim)
	{
		
		String limite =" ";			// declaramos una variable de tipo string como limite para imprimir en pantalla nuestro resultado 
		int i=0;
		boolean aux = false;		//variable auxiliar para comparar si es primo 
		for(i = 1; i <= lim; i++) 	// se realiza el primer ciclo for para declarar el limite  
		{							
			aux = true;				// declaramos nuestra variable auxiliar como true 	
			for(int j = 2; j< i; j++)  // y ejecuta el 2do ciclo for en el cual iniciamos la variable j en 2 
			{							
				if(i%j ==0)				// utilizamos un if para comparar si el numero es primo 
					{					// si es asi nuestra variable aux sera false 
					aux=false;
					}
			}
			if(aux)						// ahora que siempre que nuestra variable auxiliar sea true
				{			
				limite+=i+"\n";			// imprimira en pantalla el limite mas el numero i si es primo 
				}		
		}
		return limite;
	} 

	public String primosupinf(int limsup, int liminf)
	{
		
		String limite =" ";
		boolean aux = false;		 
		for(liminf = 0; liminf <= limsup; liminf++)
		{
			aux = true;
			for(int j = 2; j< liminf; j++)
			{
				if(liminf%j ==0)
					{
					aux=false;
					}
			}
			if(aux)
				{
				limite+=liminf+"\n";
				}		
		}
		return limite;
	} 

 
}
		  
	


		
