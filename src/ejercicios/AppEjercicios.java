package ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppEjercicios {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 							//Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. ingresar edad para un mensaje bonito");
            System.out.println("2. ingrese numero y adivinar magicamente el mes ");
            System.out.println("3. mostrar los numeros del 1 al 100 en orden  ");
            System.out.println("4. serie del 100 al 1  ");
            System.out.println("5. serie del 2 al 2000 de 2 en 2  ");
            System.out.println("6. fibonacci ");
            System.out.println("7. numero primo ");
            System.out.println("8. salir del menu ");
            

            try {
 
                System.out.println("Escribe una de las opciones\n");
                opcion = sn.nextInt();
 
                switch (opcion) {
                
///////////////////////////////////////////////////
                    case 1:Scanner entrada = new Scanner(System.in);
            		int edad;
            		String respuesta = "";
            		
            		System.out.println("digite su edad: \n");
            		Random miEdad = new Random();
            		edad = entrada.nextInt();
            		
            		respuesta = miEdad.Edad(edad);
            		
            		System.out.println(respuesta);
            		
            		//entrada.close();
            		 break;
////////////////////////////////////////////////////////////
            		case 2:Scanner entrada2= new Scanner(System.in);
            		int mes;
            		String respuesta2 = "";
            			
            		System.out.println("digite un numero del 1 al 12: \n");
            		Random miMes = new Random();
            		mes= entrada2.nextInt();
            			
            		respuesta2 = miMes.Mes(mes);
            			
            		System.out.println(respuesta2);
            			
//            		entrada2.close();
            		break;
		//////////////////////////////////////////////////////////
            		case 3:Series serie1= new Series();
            		System.out.println("\n");
            		System.out.println(serie1.serie1_100());
            		break;
		
		/////////////////////////////////////////////////////////
            		case 4:Series  serie2  =new Series();
            		System.out.println("\n");
            		System.out.println(serie2.serie100_1());
            		break;
		
		
		/////////////////////////////////////////////////////////
            		case 5:Series serie3 = new Series();
            		System.out.println("\n");
            		System.out.println(serie3.serie2_2000());
            		break;
		
		
		//////////////////////////////////////////////////////
            		case 6:Scanner entrada3 = new Scanner(System.in);
            		int limite = 0;
            		
            		System.out.println("ingrese el a que cantidad quiere llegar con la serie de fibonacci:\n");
            		
            		limite  = entrada3.nextInt();
            		long[] serieF = new long[limite];
            		Series fibonacci = new Series();
            		serieF = fibonacci.fibonacci(limite);
            		for(int cont =0; cont < limite; cont++)
            		{
            			System.out.println(serieF[cont]);
            		}
            		break;
		//////////////////////////////////////////////////////////////////
            		case 7:Scanner entrada4 =new Scanner(System.in);
            		int numero = 0;
            		boolean PrimoTrue;
            		
            		System.out.println("escriba el numero que desea saber si es primo\n");
            		numero= entrada4.nextInt();
            		Series esPrimo= new Series();
            		PrimoTrue= esPrimo.Primo(numero);
            		
            		System.out.println("el numero: "+numero+" es primo ?:"+PrimoTrue);
            		break;
            		
        /////////////////////////////////////////////////////////////////
            		
            		 default:System.out.println("Solo números entre 1 y 8\n");
            		 break;
                }
            } catch (InputMismatchException e) {
                 System.out.println("Debes insertar un número\n");
                 sn.next();
         }
	}

	}
}
