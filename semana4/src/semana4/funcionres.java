package semana4;

import java.util.Scanner;

public class funcionres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String line;
		Scanner lector = new Scanner(System.in);//  permite a  lectura del  teclado 
		line =lector.nextLine();
		
	int num =	Integer.parseInt(line);
	
	int res=divisor(num);
	System.out.println("los numeros a   sumar son "+res);	
		
	}
	
	public static int   divisor(int  num)
	
	{
		int result=0;
		for(int x=1;x<=num;x++)
			
		{
			// System.out.println("los numeros a   sumar son "+x);			
			
			if(num % x==0)
				
			{
				//System.out.println("los numeros a   sumar son "+x);	
			result=x+result;
				
			}
		}
		return result;
	}

}
