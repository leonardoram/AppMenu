package org.menu;

public class Fibonacci {
	
	public long[] fibonacci(int limite)
	{
		
		long[] serieF= new long[limite];
		
		serieF[0]=0;
		serieF[1]=1;
		
		for(int cont =2; cont<limite;cont++)
		{
			serieF[cont]=serieF[cont-2] + serieF[cont-1];
		}
		
		return serieF;
		
	}

}
