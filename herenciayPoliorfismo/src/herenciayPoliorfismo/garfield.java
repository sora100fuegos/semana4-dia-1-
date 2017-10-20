package herenciayPoliorfismo;

public class garfield    extends Animal {
	
	
	String nombre;
	public garfield()
	
	
	{
		nombre  = "Garfield";
		
	}
	
	public void comer(String comida)
	
	{
		
		
		if(comida.equalsIgnoreCase("lasagna"))
		{
			
			System.out.println("yay");
			
			
		}
		
		else
		{
			System.out.println("mucack");
		}
	}
	
	

}
