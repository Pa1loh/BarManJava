
public class Principal {

	public static void main(String[] args) {
		
		BarMan b1 = new BarMan (true,"Casamento"); // True esta informando que o bar só tem alcool 
		b1.fichaBarman();
		b1.preparar();
		b1.servir();
		b1.abastecer();
		
		BarMan b2 = new BarMan(100,"Formatura");
		b2.fichaBarman();
		b2.preparar();
		b2.servir();
		b2.abastecer();
		
		
	}

}
