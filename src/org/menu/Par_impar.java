package org.menu;

public class Par_impar {
	
	public boolean Par(int numero)  // se declara el metodo Par 
	{
		
		boolean isPar = false; // se inicializa la variable isPar de tipo bool como false 
		if(numero %2 ==0) {		// se realiza la comparacion del residuo para saber si es multiplo de 2 
			
			isPar = true;		// si lo es el valor de isPar cambia a true 
		}
		else
			isPar = false;		// si no permanece en falso 
			
		return isPar;
	}
	
	public boolean imPar(int numero)  // se declara el metodo imPar 
	{
		
		boolean isimPar = false; // se inicializa la variable isimPar de tipo bool como false 
		if(numero %2 !=0) {		// se realiza la comparacion del residuo para saber si es multiplo de 2 
			
			isimPar = true;		// si lo es el valor de isimPar cambia a true 
		}
		else
			isimPar = false;		// si no permanece en falso 
			
		return isimPar;
	}
	
	
	
	
	

}
