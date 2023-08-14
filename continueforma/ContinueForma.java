package continueforma;

public class ContinueForma {
public static void main(String[] args)
	
    {
		for(int i=0;i<=10;i++)
		{ 
			System.out.println("Dentro del ciclo");
			 if(i == 6) 
				{
				continue;
				}
			 System.out.println(i);
		}	
		System.out.println("Se termino el ciclo");
	
	}

}
