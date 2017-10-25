

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logins
 */
@WebServlet("/Logins")
public class Logins extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logins() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String correo  =  request.getParameter("correo");
		
		
		 System.out.println("el correo es "+correo  +":"  );
		 
		 
	   String password = request.getParameter("password");
		 System.out.println("la contaseña es "  + password);
		 
	   
	   
	   login  log  = new login();
	   
	   
	   log.setCorreo(correo);
	   
	   log.setpassword("13579");
	   HttpSession sesion;

	   System.out.println("@"+correo  +":"  + password);
	   if(log.verificarPassword(password)==true)
		   
	   {
		   response.sendRedirect("Success.jsp");
		    sesion  = (HttpSession)  request.getSession();
		    
		    sesion.setMaxInactiveInterval(10);
		   System.out.println(sesion.getId());
	   }
	   
	   else
	   {
		   
		   response.sendRedirect("error.jsp");
		   
	   }
	   
		
	}

}
