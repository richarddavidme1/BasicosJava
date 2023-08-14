package tablasdemultiplicar;

public class TablasDeMultiplicar {
	public static void main(String[] args)
	
    {
		int multi=0;
		for(int i=1;i<=10;i++)
		 { 
			for(int j=1;j<=10;j++)
			{
				multi=i*j;
				System.out.println("La tabla de multiplicar de "+ i +" x "+ j + " es : "+multi);
				
			}
			System.out.println("-------------------------------------------");
		 }
    }

}
