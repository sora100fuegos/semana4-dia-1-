package miclase;

public class lenguasgreco   extends evaluaridioma {
	
	

	String idioma;
	public  void   frances(String  idioma)
	{
		
		if(idioma.contentEquals("oi"))
		{
		System.out.println(" \n correcto es frances");
		
		Caracteristicas("frances");
		
		
		
		}
		
		else{
			
			
			System.out.println("equivocaste no es frances");
			
			
		evaluar(idioma);
		this.idioma=evaluar(idioma);
		Caracteristicas(this.idioma);
			
		}
		
		
		
	}
	
	
	
	public  void   español(String  idioma)
	{
		
	
	
	if(idioma.contentEquals("hola"))
	{
	System.out.println("  \n correcto es español");
	
	
	Caracteristicas(idioma);
	}
	
	else{
		System.out.println("te equivocaste");
		
	evaluar(idioma);	
	this.idioma=evaluar(idioma);
	Caracteristicas(this.idioma);
			
	}
	
	
	  
	}
	
	
	public  void   ingles(String  idioma)
	{
		
	
	
	if(idioma.contentEquals("hello"))
	{
	System.out.println(" \n correcto es ingles");
	
	   Caracteristicas(idioma);
	   this.idioma=evaluar(idioma);
		Caracteristicas(this.idioma);
	
	}
	
	else{
		System.out.println("te equivocaste");
		
	evaluar(idioma);
	Caracteristicas(idioma);
	this.idioma=evaluar(idioma);
	Caracteristicas(this.idioma);
		
	}
	
	
	  
	}
	
	
	

}
