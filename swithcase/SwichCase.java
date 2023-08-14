package swithcase;

public class SwichCase {
	public static void main(String [] args)
	{
		int num1=10,num2=5,resul=0;
		int opcion=1;
		
		switch (opcion) 
		{
		
		case 1: 
		{
			resul=num1+num2;
			System.out.println("La suma es: "+resul);
			break;
		}
		case 2: 
		{
			resul=num1-num2;
			System.out.println("La resta es: "+resul);
			break;
		}
		case 3: 
		{
			resul=num1*num2;
			System.out.println("La multiplicacion es: "+resul);
			break;
		}
		case 4: 
		{
			resul=num1/num2;
			System.out.println("La division es: "+resul);
			break;
		}
		
		
		default:
			System.out.println("La opcion es incorrecta");
			break;
		}
			
	}
}
