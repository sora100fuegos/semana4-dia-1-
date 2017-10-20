package herenciayPoliorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oddie chucho=new Oddie();
		garfield gatillo=new garfield();
		
		String cadena="";
		Integer  entero=0;
		
		double  doblecoma=0.0;
		
		boolean booleano  = true;
		
		Float flotante =0.0f;
		
		
		chucho.comer();
		chucho.dormir();
		
		chucho.Ladrar();
		
		
		
		
		gatillo.comer("lasagna");
		gatillo.comer("LASAGNA");
		gatillo.comer("lasagna".toUpperCase());

		gatillo.comer("lasaña");
		
		nermal  gata=  new nermal();
		
		gata.molestar(gatillo.nombre);
		gata.comer();
		gata.dormir();
		
		
		
	}

}
