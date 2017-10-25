package frutas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Refrigerador  refri= new Refrigerador();

refri.setTemperatura(4);

Cajafrutas cajaFrutas =  new Cajafrutas();


/// creaos un objet  de  caja   frutas ,   cada fruta  hereda  atributos  de  la clase fruta en general

Papaya papaya = new Papaya();
papaya.setExpiracion(4);	

papaya.Setsemillas(4);

papaya.setColor("cafe");

papaya.SetTamanio("grande");


papaya.descomponer();



Sandia sandia = new Sandia();
sandia.setExpiracion(3);		
		
sandia.setColor("cafe");

sandia.SetTamanio("grande");

Banana banana= new Banana();
banana.setExpiracion(5);	


banana.setColor("amarilla");

banana.SetTamanio("chica");

//////////  asigna en un arreglo la  propiedad 

Papaya[] Papayas  = new Papaya[3];


ArrayList <Papaya> ListaPapaya =new ArrayList<Papaya>();

//lista  de  frutas

ArrayList <Frutas> frutas =new ArrayList<Frutas>();

frutas.add(papaya);
frutas.add(sandia);
frutas.add(banana);



ListaPapaya.add(papaya);

for(int x=0;x<1000;x++)
	
{
	ListaPapaya.add(papaya);

	
}
Sandia[] sandias= new Sandia[1];
Banana[] bananas  = new Banana[1];


ListaPapaya.remove(999);
System.out.println("el tamaño de semillas es"+ListaPapaya.get(3).getSemillas());


/*

for(int  x=0;x <ListaPapaya.size();x++)
	
{
	System.out.println("el tamaño de semillas es"+ListaPapaya.get(x).getExpiracion());
	
}


Iterator<Papaya> itr  =ListaPapaya.iterator();

while(itr.hasNext())
	
{
	
	System.out.println("el tamaño de semillas es"+itr.next().getExpiracion());
}

*/


Vector<Frutas>  miVector = new Vector<Frutas>(100);
miVector.add(papaya);

miVector.add(banana);

miVector.add(sandia);

/*
Enumeration<Frutas> en  =miVector.elements();


while(en.hasMoreElements())

{
	System.out.println("la demostracion de     el vector  es"+en.nextElement().getExpiracion());
	
	
}



HashMap<Integer,String>  miTabla=  new HashMap<Integer,String>();

miTabla.put(1000, "chana");
miTabla.put(101, "juana");

miTabla.put(1020, "chona");

miTabla.put(103, "Primitivo");



for (Map.Entry miEntry :miTabla.entrySet())


{
	

	System.out.println("llave "+miEntry.getKey()+" valor  : "+miEntry.getValue());
	
}
for(Map.Entry salida: miTabla.entrySet())
{
	
	
	System.out.println("la demostracion del hash map es"+salida.getKey()+":"+salida.getValue());
	
}


*/


Scanner lector = new  Scanner(System.in);

System.out.println("ingrese algo");

//int algo=  lector.nextInt();


//assert  algo>= 60:"estas chavo";

//System.out.println("valor de algo   "+algo);


//////.-

for(int x=0;x<Papayas.length;x++)
	
{
	Papayas[x]= papaya;
	
	
	//Papaya papaya = new Papaya();
	papaya.setExpiracion(4);	

	papaya.Setsemillas(4);

	papaya.setColor("cafe");

	papaya.SetTamanio("grande");
	//System.out.println(Papayas[x]);
}

for(int x=0;x<sandias.length;x++)
	
{
	sandias[x]= sandia;
	
}


for(int x=0;x<bananas.length;x++)
	
{
	bananas[x]= banana;
	
}




cajaFrutas.Papaya=Papayas;
cajaFrutas.Sandia=sandias;
cajaFrutas.bananas=bananas;
		
refri.setCajaFruta(cajaFrutas);

for(int i=0;i<refri.getCajaFruta().Papaya.length;i++)
{
System.out.println(refri.getCajaFruta().Papaya[i].getExpiracion());




	}	

//System.out.println("tamaño de lista papaya"+ListaPapaya.size());
	
	//refri.mostrar();
	
	for(MiEnum  enumerar :MiEnum.values())
	{
		
		System.out.println(" MiEnum "+  enumerar);
		
	}
	

	
	
	//sin lambda
	
	
	Clavija miClavija = new Clavija()
	{
			public  void conectarse()
			
			{
				System.out.println(" calvija   1!!!!! ");
				
			}

			
			
				


	};
	
	
	miClavija.conectarse();
	
	//con lambda
	Clavija miClavija2 =()->{
		
		System.out.println(" \ncalvija   2!!!!! ");
	};
	
	miClavija2.conectarse();
	
	Otraclase  nueva = (palaba)->{
		
		return palaba+"  es lo que  dijiste";
		
	};
	
	
	System.out.println(nueva.cadena("sqswdsw"));
	
	ArrayList<Papaya>lista = new ArrayList<Papaya>();
	lista.add(papaya);
	
	for(int  x=0;x<1000;x++)
	{
		lista.add(papaya);
		
	
	}
	
	
	lista.forEach(
			
			salida->
			
			{
				
				System.out.println("la fecha de expiracion es "+salida.getExpiracion());
			
			System.out.println("el color de la papaya es"+salida.getColor());
			
			
	}
			);
	
	List  <Producto> listan = new  ArrayList<Producto>();
	listan.add(new Producto(1,"banana",12));
	listan.add(new Producto(1,"papaya",12));
	listan.add(new Producto(1,"sandia",12));
	
	Collections.sort(listan,(valor1,valor2)->{
		
	
			return String.valueOf(valor1.nombre).compareTo(String.valueOf(valor2.nombre));
			
			
	});
	
	for (Producto p:listan)
		
	{
		
		System.out.println("Producto"+p.id+":  "+ p.nombre+":  "+p.precio);
	}
	
	
	
}
	
	
	
	
	public enum MiEnum
	
	{
		
		Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo
	}
	
	
}
