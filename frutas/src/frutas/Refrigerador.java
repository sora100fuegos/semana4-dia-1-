package frutas;

public class Refrigerador implements Clavija {
	
	private int  temperatura ;
	
	private Cajafrutas cajaFruta;
	
	int voltaje;
	
	public void setCajaFruta(Cajafrutas caja)
	
	{
		this.cajaFruta=caja;
		
	}
	
public   Cajafrutas  getCajaFruta()
	
	{
		return cajaFruta;
		
	}
	

public  void  mostrar()
{
	
	for(int x=0;x<cajaFruta.bananas.length;x++)
		
	{
		System.out.println(cajaFruta.bananas[x].getExpiracion());
		
		System.out.println(cajaFruta.bananas[x].gettamanio());
		System.out.println(cajaFruta.bananas[x].getColor());
	}
	
	for(int x=0;x<cajaFruta.Papaya.length;x++)
		
	{
		System.out.println(cajaFruta.Papaya[x].getExpiracion());
		
		System.out.println(cajaFruta.Papaya[x].getColor());
		System.out.println(cajaFruta.Papaya[x].getSemillas());
		System.out.println(cajaFruta.Papaya[x].gettamanio());
	}

	
	for(int x=0;x<cajaFruta.Sandia.length;x++)
		
	{
		System.out.println(cajaFruta.Sandia[x].getExpiracion());
		System.out.println(cajaFruta.Sandia[x].getColor());
		System.out.println(cajaFruta.Sandia[x].gettamanio());
		
	}


	
}
	
	
	
	
	public Refrigerador()
	
	{
		
		
		
	}
	public   void setTemperatura(int temp)
	{
		
		
		this.temperatura=temp;
		
		
	}
	
	public int getTemperatura()
	
	{
		
		return temperatura;
	}

	@Override
	public void conectarse() {
		// TODO Auto-generated method stub
		
	}
	
	

}
