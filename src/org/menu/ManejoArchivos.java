package org.menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos{
	
	public String leerArchivo(String nombreArchivo)
	{
		String cadena ="";
		String temp= "";
		FileReader reader;
		BufferedReader bf;
		
		try 
		{
		
		reader = new FileReader(nombreArchivo);
		bf = new BufferedReader(reader);
		
		while((temp = bf.readLine())!=null)
		{
			//System.out.println(cadena);
			cadena =cadena+ temp+"\n";
		}
		bf.close();
		reader.close();
		}
		catch(FileNotFoundException ex)
		{
			//System.out.println("error 404 no se encontro el archivo "+nombreArchivo);
			cadena = "no se encontro el archivo "+nombreArchivo;
		}
		catch(IOException e)
		{
			//System.out.println("el archivo no pudo ser cerrado");
			cadena ="el arhivo "+nombreArchivo+" no pudo ser cerrado\n"+e.getMessage();
			//e.printStackTrace();
		}
		
		return cadena;
		
	}
	
	public void escribirArchivo(String nombreArhivo, String contenido )
	{
		FileWriter archivo;
		PrintWriter writer;
		
		try
		{
			archivo = new FileWriter(nombreArhivo, true);
			writer = new PrintWriter(archivo);
			//writer.println(contenido);
			for(int cont =200;cont<=300;cont++)
			{
				writer.println(cont);
			}
			
			archivo.close();
			writer.close();
		}
		catch(IOException perro)
		{
			perro.printStackTrace();	
		}
	}
	
<<<<<<< HEAD
//	public String tabla_multiplicar(int limLargo, int limBajo)
//	{
//		String tabla="";
//		for(int cont = 1; cont <=limBajo; cont++)
//		{
//			for(int cont2=1; cont<= limLargo; cont2++)
//			{
//				tabla = tabla + " "+cont+" x "+limBajo+ " "(cont)
//			}
//		}
//		return tabla;
//	}
=======
	public String tabla_multiplicar(int limLargo, int limBajo)
	{
		String tabla="";
		for(int cont = 1; cont <=limBajo; cont++)
		{
			for(int cont2=1; cont<= limLargo; cont2++)
			{
				tabla = tabla + " "+cont+" x "+limBajo+ " "+(cont);
			}
		}
		return tabla;
	}
>>>>>>> branch 'master' of https://github.com/leonardoram/AppMenu.git


}
