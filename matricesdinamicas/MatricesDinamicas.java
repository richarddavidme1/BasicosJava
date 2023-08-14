package matricesdinamicas;

import java.util.Arrays;
import java.util.Scanner;

public class MatricesDinamicas {
	public static void main(String[] args) 
	{
		int filas=0,columnas=0,datos=0;
		Scanner ingreso=new Scanner(System.in);
		System.out.println("Ingrese el numero de filas");
		filas=ingreso.nextInt();
		System.out.println("Ingrese el numero de columnas");
		columnas=ingreso.nextInt();
		
		int matrizdinamica[][]=new int[filas][columnas];
		for(int j=0;j<filas;j++)
		{
			for(int i=0;i<columnas;i++)
			{
				System.out.println("Ingrese el espacio fila ["+j+"]"+"columna ["+i+"]");
				System.out.println("");
				datos=ingreso.nextInt();
				matrizdinamica[j][i]=datos;
				System.out.println(matrizdinamica[j][i]);
			}
		}
		System.out.println(Arrays.deepToString(matrizdinamica));
	}

}
