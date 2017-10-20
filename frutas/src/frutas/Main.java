package frutas;

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


Sandia sandia = new Sandia();
sandia.setExpiracion(3);		
		
sandia.setColor("cafe");

sandia.SetTamanio("grande");

Banana banana= new Banana();
banana.setExpiracion(5);	


banana.setColor("amarilla");

banana.SetTamanio("chica");

//////////  asigna en un arreglo la  propiedad 

Papaya[] Papayas  = new Papaya[1];
Sandia[] sandias= new Sandia[0];
Banana[] bananas  = new Banana[0];



//////.-

for(int x=0;x<Papayas.length;x++)
	
{
	Papayas[x]= papaya;
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
	
	refri.mostrar();

}
}
