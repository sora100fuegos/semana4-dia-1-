package miclase;

public class evaluaridioma extends idiomascar {

	String  idioma;
	
	
public evaluaridioma()
	
	
	{
		
		
	}
	public String evaluar(String  idioma)
	
	
	{
		if(idioma.contentEquals("oi"))
			
		{
			
			System.out.println("es   frances");
			
			idioma="frances";
		}
		
		else
		{
			if  (idioma.contentEquals("hola"))
				
			{
				System.out.println("es   español");
				

				idioma="español";
			}
			
			else
				
			{
				if  (idioma.contentEquals("hello"))
					
				{
					System.out.println("es   ingles");
					

					idioma="ingles";
				}
				
				else
				{

					idioma="japones";
				}
			}
			
		}
		return idioma;
		
	}
	
	public void  Caracteristicas(String idioma)

	{
		
		
		
		System.out.println("las caracteristicas del idioma "+idioma);
		verbos();
		pronombres();
		adejetivos();
		gramaticas();
		
		
	}
}
