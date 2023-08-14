package bucleexterno;

public class BucleExterno {
	public static void main(String[] args) {
		
	bucleexterno:
		for(int i=1;i<=3;i++)
		 { 
			System.out.println("bucle externo");
			System.out.println(i);
			   for(int j=1;j<=3;j++)
			     { 
				 	System.out.println("bucle interno");
					if(j==2)
					  {
					continue bucleexterno;
					  }
					System.out.println(j);
			     }	
		 }
	}
}
