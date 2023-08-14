package caracteres;

import java.util.Scanner;

public class CaracteresManipulacion {
	public static void main(String[] args) {
		
		String  cadena=" ",cortecadena="";
		int     desde=0,hasta=0;
		Scanner ingreso=new Scanner(System.in);
		
		System.out.println("Ingrese la cadena de su eleccion");
		cadena=ingreso.nextLine();
		int numero=cadena.length();
		System.out.println("El numero de caracteres es: "+numero);
		System.out.println("Ingrese en que numero desea el corte inicial");
		desde=ingreso.nextInt();
		System.out.println("Ingrese en que numero desea el corte final");
		hasta=ingreso.nextInt();
		
		cortecadena=cadena.substring(desde, hasta);
		System.out.println("La cadena cortada es:"+cortecadena);
		
		
	}


}
