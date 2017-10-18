package semana4;

import java.util.Scanner;

import com.salon4llora.Sacapuntas;

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
	
	System.out.println(x4 || az);
	
	System.out.println(x4 && az);
	
	
	
	if(x4==az)
	{
		
		
	}
	
	System.out.println("\n\n");
	
	
	if(x4==az)
	{
		System.out.println("chana");
		
	
		
		
	}
	
	
	else if(x4==az)
	{
		System.out.println("juana");
		
	
		
		
	}
	
	
	else if(x4==az)
	{
		System.out.println("melon");
		
	
		
		
	}
	
	else if(!x4==!az)
	{
		System.out.println("juana");
		
	
		
		
	}
	  
	///switch //////////
	
	
	String opcion = "chana";
	
	Scanner lector = new Scanner(System.in);//  permite a  lectura del  teclado 
	opcion =lector.nextLine();
	
	
	
	/*
	switch (opcion)
	
	{
	
	case "chana":
	System.out.println("chana");
	break;
	
	
	case "juana":
		System.out.println("juana");
		break;
		
	case "chona":
		System.out.println("chona");
		break;
		
		
		default:
			System.out.println("ninguno");
			break;
			
		
	}
	*/
	
	///metodod equals 
	
	if(opcion.equals("hola"))
	{
		System.out.println("aprobaste");
	}
	
	else
	{
		System.out.println("reprobaste");
	}
	

int contador=0;
while(contador<meses.length)
	
{
	
	System.out.println(contador+1);
}




Estudiante estudiHambre = new Estudiante(2, "Juancho");
//Obtener los datos de forma segura
System.out.println(estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
//Cambiar los valores
estudiHambre.setCodigo(4);
estudiHambre.setNombre("Gloria");
//Obtener los datos de forma segura
System.out.println("\n"+estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());

//Llamar al mpetodo sin modificador de acceso
estudiHambre.probar();

Sacapuntas sacaPuntas = new Sacapuntas(456, "filo");

int id2;
//id2++;
//System.out.println("\n ID del deorden"+id2);





	}



}