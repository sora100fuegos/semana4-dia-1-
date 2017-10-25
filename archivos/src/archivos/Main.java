package archivos;

		// TODO Auto-generated method stub
		import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.google.gson.Gson;



		public class Main {

			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
				

				escribirArchivo("C:/Users/jorge/Documents/code ninja/java/archvos/src/archvos/texto.txt"); 
				leerArchivo("C:/Users/jorge/Documents/code ninja/java/archvos/src/archvos/texto.txt");
				
				leerArchivoManual("C:/Users/jorge/Documents/code ninja/java/archvos/src/archvos/texto.txt");
				
				serializarObjeto("C:/Users/jorge/Documents/code ninja/java/archvos/src/archvos/texto.txt");
				
			}
			
			public static void serializarObjeto(String archivo)
			{
				try {
					FileOutputStream salida = new FileOutputStream(archivo);
					ObjectOutputStream oSt = new ObjectOutputStream(salida);
					oSt.writeObject("Today");
					DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					Gson gson = new Gson();
					
					oSt.writeObject(dateFormat.format(date).toString());
					oSt.writeObject(gson.toJson(dateFormat.format(date)));
					System.out.println(gson.toJson(dateFormat.format(date)));
					oSt.close();
					System.out.println("Hecho...");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
			public static void escribirArchivo(String archivo)
			{
				String []datos = {"hola","ke","ase"};
				int []numeros = {1,2,3,4,5,6,7,8,9};
				try
				{
					PrintWriter miPrintWriter = new PrintWriter(
							new BufferedWriter(new FileWriter(archivo)));
					
					int lineaC = 1;
					
					for(int i =0;i < datos.length; i++)
					{
						miPrintWriter.println(datos[i]);
					}
					miPrintWriter.close();
					System.out.println("Hecho..");
				}catch(IOException e){
					e.printStackTrace();
				}
				
			}
			
			public static void leerArchivoManual(String archivo)
			{
				int nLinea = 1;
				try
				{
					BufferedReader bfrd = new BufferedReader(
							new FileReader(archivo));
					
					String s = new String();
					String s2 = new String();
					Scanner lector = new Scanner(System.in);
					System.out.println("Ingrese una linea: ");
					int nLinea2 = lector.nextInt();
					
					while( (s = bfrd.readLine() ) != null)
					{
						if(nLinea2 == (nLinea))
						{
							System.out.println(nLinea+" : "+s);
						}
							
						nLinea++;
					}
					
					bfrd.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			
			public static boolean leerArchivo(String archivo) 
			{
				int nLinea = 0;
				try
				{
					BufferedReader bfrd = new BufferedReader(
							new FileReader(archivo));
					
					String s = new String();
					String s2 = new String();
					
					while( (s = bfrd.readLine() ) != null)
					{
						System.out.println(nLinea+" : "+s);
						nLinea ++;
					}
					bfrd.close();
					
					return true;
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
					
					return false;
				}
				
				
				
			catch (IOException  e)
			
			{
				
				e.printStackTrace();
				
				return false;
			}
			
			

		
	}
			
		}


