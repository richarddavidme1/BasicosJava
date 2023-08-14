package usuario;

import java.util.Scanner;

public class Usuario {
	public static void main(String[] args)
	{
		String  nombre="David",nombre1=" ";
		int password=2345,clave=0;
		Scanner ingreso=new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		nombre1=ingreso.nextLine();
		System.out.println("Ingrese su clave");
		clave=ingreso.nextInt();
		
		if(nombre1.equalsIgnoreCase(nombre) && (clave==password))
		{
			System.out.println("Buenas dias ingreso permitido");
		}else {
			System.out.println("Ingreso denegado tiene 2 oportunidades");
		}
	}


}
