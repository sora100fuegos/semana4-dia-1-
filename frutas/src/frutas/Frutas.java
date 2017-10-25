package frutas;

abstract  class Frutas {
	
	private String color;
	
	private String tamanio;
	
	private int  expiracion;
	
	
	public Frutas()
	
	{
		
	}
	
	public   void setColor(String c)
	
	{
		
		this.color=c;
	}
	
	
public   String  getColor()
	
	{
		
		return color;
	}

public  void setExpiracion (int  exp )

{
	
	this.expiracion=exp;
}

public  int getExpiracion ()

{
	
	return expiracion;
}


	
public  void SetTamanio(String  tamanio)

{
	
	this.tamanio=tamanio;
}

public String gettamanio()

{
	
	return tamanio;
}


abstract  void descomponer();

}
