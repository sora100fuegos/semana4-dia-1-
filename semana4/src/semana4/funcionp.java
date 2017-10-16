package semana4;

public class funcionp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=10;
		int y=9;
		
		
		float  num1=  10f;
		float  num2= 9.4f;
		
		float res= num1+x;
		double  a=34;
		double b=23.4;
     double c =20;
				
		System.out.println("el resultado de  la operacion  de la suma de   " +x +"+"+  y  + "es "+x+y);
		System.out.println("el resultado de  la operacion  de la suma de   " +num2+x +" el segundo resultado e"+  res);
		double x2= (  (-b)-  Math.sqrt(Math.pow(b, 2)  -4*(c*a)))/(2*a) ;
		
		System.out.println("chicharronera"+x2);
		
		
		float numeri;
		int espacio=3;
		String  文字列 ="parangotirinicuaro";
		String cadena="ABACDEFGHIJKLMNOPQRSTSUVWXYZ";
		System.out.println("//////cadenas////////");
		System.out.println(文字列);	
	
	  for(int x1=0;x1<文字列.length();x1++)
	  {
		  System.out.println(文字列.charAt(0));
		  
		  文字列.replace(文字列.charAt(0), 文字列.charAt(x+espacio));
		  
		 System.out.println(cadena.substring(3, 6));
	  }
	  
	  
	  System.out.println(文字列);
	  
	  //arrays//////////////////////////////////////////
	  
	  String []  meses={"jan","feb","mar","abr","may","jun","jul","ago","sept","oct","nov","dic"};
	  
	  String []  days ={"mon","tues","wed","thu","fri","sat","sun"};
	  
	  System.out.println(meses[0]+  "       "+  meses[6]+"      "+ meses[10]);
	  
	  System.out.println(days[0]+  "       "   +  days[4]+  "      " + days[1]);
	  
	  for(int x1=0;x1<=meses.length;x1++)
		  
	  {
		  if(x1==0||x1==6||x1==10)
		  {
			  
			  System.out.println("los meses   son "+meses[x1]);
		  }
	  }  
		  
		  
  for(int x1=0;x1<=days.length;x1++)
		  
	  {
		  if(x1==0||x1==4||x1==1)
		  {
			  
			  System.out.println("los dias  son    "+days[x1]);
		  }
		  
		  
	  }
  
	
	
	// estructuras de  control/////////////////
	
	boolean x4 =  true;
	
	boolean az =  false;
	
	
	System.out.println("\n\n");
	
	
	System.out.println(x4 != az);
	
	if(x4==az)
	{
		
		
	}
	
	System.out.println("\n\n");
	
	
	  
	}

}