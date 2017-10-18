package semana4;

public class cuentap 
{
	String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
			"Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
			"Noviembre", "Diciembre"};
	
	int numeroDeLetras;
	
	public cuentap()
	{
		
	}
	
	public cuentap(int numero)
	{
		this.numeroDeLetras = numero;
	}
	
	public void cuentaLetras()
	{
		for(int f = 0; f < meses.length; f++)
		{
			if(meses[f].length() == numeroDeLetras)
			{
				System.out.println(meses[f]+" : "+numeroDeLetras);
				break;
			}
		}
		System.out.println("////////////");
		for(int f = 0; f < meses.length; f++)
		{
			if(meses[f].length() == numeroDeLetras)
			{
				System.out.println(meses[f]+" : "+numeroDeLetras);
				
			}
		}
	}
	//Crear otro método
	

}