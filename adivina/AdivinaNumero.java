package adivina;

import java.util.Scanner;

public class AdivinaNumero
{
	public static void main(String[] args)
	
  {
		int i=4,numero=0;
		Scanner ingreso=new Scanner(System.in);
		
		do {
			System.out.println("Ingrese numeros del 1 al 10");
			numero=ingreso.nextInt();
			if(numero==i)
			{
				System.out.println("Ganaste Felicitaciones");
				break;
			}else {
				System.out.println("Error te queda dos vidas");
			}
			
			
		} while (numero != i);
		System.out.println("su numero es: "+numero);
				
  }
}
