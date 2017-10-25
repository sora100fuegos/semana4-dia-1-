

public class login {
	
	
	String   correo;
	String password;
	
	public String getCorreo()
	
	{
		
		return correo;
	}
	
	
	
	public void  setCorreo(String correo)
	
	{
		
		this.correo= correo;
	}
	
	
public String getpassword()
	
	{
		
		return password;
	}
	
	
	
	public void  setpassword(String  password)
	
	{
		
		this.password= password;
	}
	
	
	public  login()
	
	{
		
		
		
	}
	public boolean verificarPassword(String password)
	
	{
		if(this.password.equals(password))
				
				{
			
			return true;
				}
		
		else{
			
			return false;
		}
		
	}
	
	
	

}
