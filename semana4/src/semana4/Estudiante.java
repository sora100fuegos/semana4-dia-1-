package semana4;

	
	public class Estudiante 
	{
		//Atributos de la clase, n�tese que son privados
		private int codigo;
		private String nombre;
		
		//Constructor de la clase (por defecto)
		public Estudiante()
		{
			
		}
		//Constructor sobrecargado
		public Estudiante(int codigo, String nombre)
		{
			//Llamada a m�todos
			//Se establecen valores de forma segura
			setCodigo(codigo);
			setNombre(nombre);
		}
		/*
		 * Como los atributos de la clase con privados,
		 * necesito una manera de acceder a sus valores.
		 * Por eso creo m�todos para poder acceder de 
		 * forma segura a estos.
		 * */
		/**
		 * @return the codigo
		 */
		public int getCodigo() {
			return codigo;
		}
		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		void probar()
		{
			System.out.println("Hola, soy un m�todo sin modificador de acceso");
		}
		
	}

