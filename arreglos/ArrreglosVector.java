package arreglos;

import java.util.Scanner;

public class ArrreglosVector {
	public static void main (String[] arg)
	{
		int dimension=0,valor=0;
		Scanner ingreso=new Scanner(System.in);
		System.out.print("Ingresa el numero de elementos: ");
		dimension=ingreso.nextInt();
		int vamos[]=new int[dimension];
		for (int i = 0; i < vamos.length; i++)
		{
			System.out.print("Ingresa el valor de la posicion "+ (i+1) +" :");
			valor=ingreso.nextInt();
			vamos[i]=valor;
		}
		
	}

}
