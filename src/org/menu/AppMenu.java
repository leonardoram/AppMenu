package org.menu;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMenu {
	// nuevos comentarios solo para incrementar el commit
	
	public static void main(String[] args) {


		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean bandera = true;
        int opcion; 							
        Scanner in= new Scanner(System.in);
        
        while (!salir) {
 
            System.out.println("1. Numero par o impar");
            System.out.println("2. Numero primo ");
            System.out.println("3. Numero primo limite superior");
            System.out.println("4. Numero primo limite inferior y superior ");
            System.out.println("5. Palindromo");
            System.out.println("6. Series  ");
            System.out.println("7. Palindromo ");
            System.out.println("8. Numeros aleatorios ");
            System.out.println("9. Suma de numeros aleatorios ");
            System.out.println("10. Manejo de archivos");
            System.out.println("10");
            

            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                
                //////////////////////// numero par o impar ///////////////////////////////
                    case 1:
                    	Par_impar num = new Par_impar();		// declaramos un objeto con el nombre de num a partir de nuestra clase Par_impar			
                		
                		System.out.println("Dame un numero: ");	// solicitamos al usuario ingresar un numero 
                		int numero = in.nextInt();				// guardamos la variable 
                		System.out.println("el numero ingresado es par ?: "+num.Par(numero)); // y mandamos el resultado mandando llamar el metodo de nuestro objeto
                		System.out.println("el numero ingresado es impar ?: "+num.imPar(numero));
  
                        break;
                        ////////////////////////////////numero primo ///////////////////////////
                    case 2:
                    	Primos num2= new Primos();
                		System.out.println("Ingrese el numero ");	// solicitamos al usuario ingresar un numero 
                    	int numero2 =in.nextInt();		// escaneamos la entrada creando una variable tipo scanner 
                		
                    	System.out.println("el numero es primo ? "+num2.esPrimo(numero2));
                        break;
                        /////////////////////primos limite superior//////////////////////////////
                    case 3:
                    	Primos num3 = new Primos();
                    	System.out.println("ingrese el limite");
                    	int numero3 = in.nextInt();
                    	
                    	System.out.println("estos son los numeros primos hasta el numero "+numero3);
                    	System.out.println(num3.primolim(numero3));
                        break;
                        
                        ///////////////// primos limite superior e inferior////////////////////
                    case 4:
                    	Primos num4 = new Primos();
                    	int resultado =0;
                    	System.out.println("ingrese el limite inferior");
                    	int numero4 = in.nextInt();
                    	System.out.println("ingrese el limite superior");
                    	int numero5 = in.nextInt();
                
                    	
                    	System.out.println("estos son los numeros primos desde el numero "+numero4+" hasta el numero "+numero5);
                    	System.out.println(num4.primosupinf(numero4,numero5));
                    	
                    	
                        break;
                        
            ////////////////// palindromos       ///////////////////////////////////////////////////////////      
                    case 5: 
                    	Series palindromo = new Series();
                    	
                    	System.out.println("ingrese el texto o numero que desea saber si es palindromo");
                    	String nueva =in.next();
                    	
                    	System.out.println("el contenido de "+nueva+"fue palindromo?: ");
                    	System.out.println(palindromo.Palindromo(nueva));
                    	break;
                    
                    case 6: 
                        //////////////////// series///////////////////////
                    	
                    	Series num6 = new Series();
                    	System.out.println(num6.Serie1_100());
                    	
                    	break;
                    	
                    case 7: 
                    	salir = true;
                    	
                    case 8: 
                    	salir = true;
                    	
                    case 9:
                    	int limite_elementos = 20;  // por que se me ocurrio el 20 y YOLO  
                    	int [] vector1 = new int[limite_elementos];
                    	int [] vector2 =new int [limite_elementos];
                    	int [] vector3 = new int [limite_elementos];
                    	int [] vectorSuma = new int[limite_elementos];
                    	
                    	
                    	Vectores objVectores = new Vectores();
                    	
                    	vector1 = objVectores.AleatoriosVector(limite_elementos);
                    	vector2 = objVectores.AleatoriosVector(limite_elementos);
                    	vector3 = objVectores.AleatoriosVector(limite_elementos);
                    	
                    	vectorSuma = objVectores.sumaTresVectores(vector1, vector2, vector3);
                    	
                    	for(int cont =0;cont < vectorSuma.length; cont++)
                    	{
                    		System.out.println("vector 1: "+vector1[cont]+" vector2: "+vector2[cont]+" vector 3: "+vector3[cont]+" = "+vectorSuma[cont]);
                    		
                    	}
                    	
                    case 10: 
                    	String contenidoArchivos="";
                		
                		ManejoArchivos archivos = new ManejoArchivos();
                    	contenidoArchivos = archivos.leerArchivo("D:\\generation2\\asdfasd\\testo.txt");
                    	System.out.println(contenidoArchivos);
                    	
                    	archivos.escribirArchivo("c:\\a\\testo3.txt", "este es un testo");
                    	
                    	
                	//	tablaMultiplicar();
                	
                    break;
                    	
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
           } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                }
        }
	}
}

//        
            	
//            while(bandera)
//            {
//            	System.out.println("deseas ingresar otra opcion? s/n: ");
//            	char opcion2 ;
//            	opcion2 = in.next().charAt(0);
//            	
//            	
//            	if(opcion2 == 's' ||opcion2 == 'S')
//            	{
//            		return 
//            	}
//            }
        	
		
	

	
//	
//	public static void tablaMultiplicar()
//	{
//		FileWriter archivo;
//		PrintWriter writer;
//		
//		try
//		{
//			archivo = new FileWriter("c:\\a\\testo4.txt", false);
//			writer = new PrintWriter(archivo);
//			
//			Scanner entrada = new Scanner(System.in);
//			
//			System.out.println("que tabla de multiplicar deseas mostrar ?");
//			int numero = entrada.nextInt();
//			for(int cont =1; cont<= 20; cont ++)
//			{
//				System.out.println(numero+"x"+cont+" = "+numero*cont);
//				writer.println(numero+"x"+cont+" = "+numero*cont);
//			}
//			entrada.close();
//			
//			archivo.close();
//			writer.close();
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("error de entrada/salida");
//		}
//		
//		
//	}
//}
//
//		int i,j;
//		boolean esPrimo;
//		
//		int rInicial;
//		int rFinal;
//		Scanner prueba = new Scanner(System.in);
//		System.out.println("ingrese el limite inferior");
//		rInicial = prueba.nextInt(); 
//		System.out.println("ingrese el rango final");
//		rFinal = prueba.nextInt();
//			for(i = rInicial;i <= rFinal;i++){
//
//				esPrimo=true;
//				for(j = 2;j < i;j++){
//     
//    
//					if(i % j == 0){
//						esPrimo = false;
//					}
//				}
//				if(esPrimo){
//					System.out.println(i+"\n");
//				}
//			}
//	}
//}



/////////////////////////////////////////////////////////////////////// Par e
/////////////////////////////////////////////////////////////////////// impar
/////////////////////////////////////////////////////////////////////// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Par_impar num = new Par_impar(); // declaramos un objeto con el nombre de num
// a partir de nuestra clase Par_impar
//
// System.out.println("Dame un numero: "); // solicitamos al usuario ingresar un
// numero
// Scanner in=new Scanner(System.in); // escaneamos la entrada creando una
// variable tipo scanner
// int numero = in.nextInt(); // guardamos la variable
// System.out.println("el numero ingresado es par ?: "+num.Par(numero)); // y
// mandamos el resultado mandando llamar el metodo de nuestro objeto
// System.out.println("el numero ingresado es impar ?: "+num.imPar(numero));

/////////////////////////////////////////////////////////////////////////// Primos///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Primos num2= new Primos();
// System.out.println("Dame un numero: "); // solicitamos al usuario ingresar un
// numero
// Scanner in2=new Scanner(System.in); // escaneamos la entrada creando una
// variable tipo scanner
// int numero2 = in.nextInt();
// System.out.println("el numero que ingreso es primo ?:
// "+num2.esPrimo(numero2));
//
