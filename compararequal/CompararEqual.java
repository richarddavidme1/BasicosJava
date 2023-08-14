package compararequal;

import java.util.Scanner;

public class CompararEqual {
	public static void main(String[] args)
	{
		String  nombre="David",nombre1=" ";
		Scanner ingreso=new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		nombre1=ingreso.nextLine();
		//equalsIgnoreCase compara los string no importa las mayusculas
		if(nombre1.equalsIgnoreCase(nombre))
		{
			System.out.println("Su nombre es igual");
		}else {
			System.out.println("Nombre diferente");
		}
	}

}
