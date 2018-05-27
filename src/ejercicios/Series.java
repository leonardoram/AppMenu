package ejercicios;

public class Series {
	
	//- hdfp que muestre la sig serie 1,2,3,4,5 ... 100 
	public String serie1_100()
	{
		String resultado = "";	// se crea la variable resultado de tipo string
		
			for(int cont =0; cont<=100; cont++) // se hace un ciclo for para llenar el vector 
			{
			resultado = resultado + cont ; // se llena el vector con la variable cont y se guarda en la direccion del vector 
			}
		
		return resultado; // regresa el resultado a donde a la clase que lo mando llamar 
	}
	
	//- hdfp que muestre la sig serie 100,99,98,... 1 
	
	public String serie100_1()
	{
		String resultado2 = " ";
		
		for(int cont2= 100; cont2>=0; cont2--)
		{
			resultado2 = resultado2 +cont2;
		}
		
		return resultado2;
	}
	
	//- hdfp que saque la siguiente serie 2 4 6 ... 2000
	
	public String serie2_2000() 
	{
		String resultado3 = " ";
		for(int cont3 = 2; cont3<=2000; cont3+=2)
		{
			resultado3 = resultado3+cont3;	
		}
		
		return resultado3;
		
	}
	
	//- hdfp que haga la serie de fibonnacci 0 1 1 2 3 5 8 13 ...  con numero que pida el usuario 
	public long[] fibonacci(int limite)
	{
		long[] serieF= new long[limite];

		serieF[0]=0;
		serieF[1]=1;
		
		for(int cont4=2;cont4<limite;cont4++)
		{
			serieF[cont4]=serieF[cont4-2]+serieF[cont4-1];
		}
		
		return serieF;
	}
	public boolean Primo(int numero){
	      int contador = 2;
	      boolean primo=true;
	      while ((primo) && (contador!=numero)){
	        if (numero % contador == 0)
	          primo = false;
	        	contador++;
	      }
	      return primo;
	    }

}
