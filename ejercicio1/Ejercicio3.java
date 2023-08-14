package ejercicio1;


public class Ejercicio3 {
	public static void main(String[] args) 
  {
	//constante
    final int ABA=3;
		
	int a=0,b=1,c=0;	
	for(int i=0;i<10;i++)
	 {
	   //0,1,1,2,3,5,8,13,21,34,55
	 if (i <9)
	 {
		   System.out.print(a+".");
		   c=a+b;
		   a=b;
		   b=c;
	 }else {
		   System.out.print(a);
	       }
	 }
	
	
  }
	private void NuevoMetodo() {
		System.out.print("Es un nuevo metodo");

	}
	
}
