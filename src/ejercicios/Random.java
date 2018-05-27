package ejercicios;


public class Random {
	
	//////////////////// ejercicio 1 -hdfp que le pida al usuario su edad, si el usuario es menor de 12 años mostrar 
	//	en pantalla un mensaje que diga "niño", si es mayor o igual a 12 años y menor que 19
	//	desplegar "puberto", si es mayor o igual a 19 y menor que 35 desplegar "chavorruco" 
	//	y si es mayor o igual a 35 desplegar "el macho".

	public String Edad(int edad)			// se crea el metodo Edad 
	{
		String mensaje="";					// asignamos la variable mensaje como una cadena 
		if(edad<12)
			mensaje ="eres un niño";		// y aqui corremos el metodo 
	
		if(edad >= 12 && edad<19)
			mensaje ="eres un adolescente";
	
		if(edad >= 19 && edad<35)
			mensaje = "eres un chavorruco";
	
		if(edad >= 35)
			mensaje = "el macho";
		
		return mensaje;
		
	}
	
	///////////////////////////////////ejercicio 2 ////////////////////////////////////////////////////////////
	//-HDFP que pedir al usuario un numero del 1 al 12 y mostrar el nombre del mes que le corresponda
	//

	public String Mes(int numero)
	{
		String mensaje2="";
		
		switch(numero) {
		
			case 1: mensaje2 ="Enero";
			break;
			case 2: mensaje2 ="Febrero";
				break;
			case 3: mensaje2 ="Marzo";
				break;
			case 4: mensaje2 ="Abril";
				break;
			case 5: mensaje2 ="Mayo";
				break;
			case 6: mensaje2 ="Junio";
				break;
			case 7: mensaje2 ="Julio";
				break;
			case 8: mensaje2 ="Agosto";
				break;
			case 9: mensaje2 ="Septiembre";
				break;
			case 10: mensaje2 ="Octubre";
				break;
			case 11: mensaje2 ="Noviembre";
				break;
			case 12: mensaje2 ="Dciembre";
				break;
				default: mensaje2 = "opcion incorrecta";
				break;
			}
		return mensaje2;
		
		}
		
	
	
}
