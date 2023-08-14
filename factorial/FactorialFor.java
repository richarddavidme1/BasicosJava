package factorial;

import java.util.Scanner;

public class FactorialFor {
	public static void main(String[] args)
	
	  {
		int suma=0,fact=1,numero=0;
		Scanner ingreso=new Scanner(System.in);
		System.out.print("Ingrese el numero que desea el factorial: ");
		numero=ingreso.nextInt();		
		for(int i=1;i<=numero;i++)
		{
			suma+=i;
			fact*=i;
		}
		System.out.println("La suma es: "+suma);
		System.out.println("El factorial es: "+fact);
	  }

}
