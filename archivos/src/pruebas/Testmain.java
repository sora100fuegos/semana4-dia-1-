package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import archivos.Main;

public class Testmain {

	@Test
	public void testLeerArchivo() {
		//fail("Not yet implemented");
		
		Main main = new Main();
		
		boolean resultado  = main.leerArchivo("C:/Users/jorge/Documents/code ninja/java/archvos/src/archvos/texto.txt");
	}

}
