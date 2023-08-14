package EstructurasAnidadas;
//Ingreso de la libreria
import java.util.Scanner;

public class Estructuras {
	public static void main(String[] args)
	{

		int numeroop,num1,num2;
		
		//Creamos el objeto Scanner
		Scanner opcion= new Scanner(System.in);
		System.out.println("Ingrese la opcion");
		//Guarda el valor ingresado por el usuario
		numeroop=opcion.nextInt();
		
		System.out.println("Ingrese el primer valor");
		//Guarda el valor ingresado por el usuario
		num1=opcion.nextInt();
		System.out.println("Ingrese el segundo valor");
		//Guarda el valor ingresado por el usuario
		num2=opcion.nextInt();

		
		if(numeroop == 0)
		{
			System.out.println("La suma es: "+(num1+num2));
			
		}
		else if (numeroop ==1) 
		{
			System.out.println("La resta es: "+(num1-num2));
		}
		else if (numeroop ==2) 
		{
			System.out.println("La multiplicacion es: "+(num1*num2));
		}
		else if (numeroop ==3) 
		{
			System.out.println("La division es: "+(num1/num2));
		}
		else 
		{
			System.out.println("Opcion fuera de rango ");
		}
		
	}

}
