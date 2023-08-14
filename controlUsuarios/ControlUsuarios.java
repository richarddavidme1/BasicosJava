package controlUsuarios;

import java.util.Scanner;

/*
 * Sistema de una empresa para la designacion de tiempo de vacaciones
 * con clave de sector de trabajo y antiguedad
 */


public class ControlUsuarios {
	public static void main(String[] args) {
		Scanner llaves=new Scanner(System.in);
		String nombre=" ";
		int clave=0,antiguedad=0;
	
		
		System.out.println("****************************************");
		System.out.println("* Bienvenido al sistema de la empresa  *");
		System.out.println("****************************************");
		System.out.println("");
		System.out.println("");
		//Mensaje de usuario
		System.out.println("Ingrese su nombre \t");
		//Guarda el valor ingresado por el usuario
		nombre=llaves.nextLine();
		//Mensaje de usuario
		System.out.println("Ingrese su tiempo de trabajo en la empresa");
		//Guarda el valor ingresado por el usuario
		antiguedad=llaves.nextInt();
		//Mensaje de usuario
		System.out.println("Ingrese su clave");
		//Guarda el valor ingresado por el usuario
		clave=llaves.nextInt();
		
		
		if(clave ==1) 
		{
				if(antiguedad == 1)
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 6 dias de vacaciones ");
				}else if(antiguedad >=2 && antiguedad <=6)
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 14 dias de vacaciones ");
				}else if (antiguedad>7) 
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 20 dias de vacaciones ");
				}else 
				{
					System.out.println("Aun no tiene derecho a vacaciones");
				}
		
	    }else if(clave == 2)
	    {
				if(antiguedad == 1)
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 7 dias de vacaciones ");
				}else if(antiguedad >=2 && antiguedad <=6)
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 16 dias de vacaciones ");
				}else if (antiguedad>7) 
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 24 dias de vacaciones ");
				}else 
				{
					System.out.println("Aun no tiene derecho a vacaciones");
				}
	    	
	    }else if (clave == 3)
	    {
				if(antiguedad == 1)
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 8 dias de vacaciones ");
				}else if(antiguedad >=2 && antiguedad <=6)
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 20 dias de vacaciones ");
				}else if (antiguedad>7) 
				{
					System.out.println("El trabajador " + nombre +" tiene derecho a 30 dias de vacaciones ");
				}else 
				{
					System.out.println("Aun no tiene derecho a vacaciones");
				}
		    	
	    }else  
	    {
		    	System.out.println("La clave ingresada es erronea");
		}
		
		
		
		
	    
	}
}
