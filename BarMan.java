
public class BarMan implements Bar {
	//atributos
	
	private boolean trabalhando;  // se o bar man esta oucupado ou n�o
	private boolean �lcool;       // se o bar man vai servir para menores 
	private String evento;        // Casamento ou Formatura
	private float valor = 0;                  // Caso o valor esteja combinado
	
	
	public BarMan(boolean �lcool, String evento) {
		super();
		this.�lcool = �lcool;
		this.evento = evento;
	}


	public BarMan(float valor, String evento) {           // Construtor com valor combinado.
		super();
		this.valor = valor;
		this.evento = evento;
	}


	public boolean getTrabalhando() {
		return trabalhando;
	}


	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}


	public boolean get�lcool() {
		return �lcool;
	}


	public void set�lcool(boolean �lcool) {
		this.�lcool = �lcool;
	}


	public String getEvento() {
		return evento;
	}


	public void setEvento(String evento) {
		this.evento = evento;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	@Override
	public void preparar() {
		System.out.println("Preparando Drink");
		this.setTrabalhando(true);
		
	}


	@Override
	public void servir() {
		if(this.getTrabalhando()) {
			System.out.println("Servindo Drink...");
			System.out.println("Drink Servido!");
			this.setTrabalhando(false);
		}else {
			System.out.println("N�o preparei nenhum drink!");
		}
		
	}


	@Override
	public void abastecer() {
		System.out.println("Buscando Bebidas!!!");
		
	}
	
	public void fichaBarman() {
		System.out.println("----------Ficha------------");
		System.out.println("Estou trabalhando em um evento de: " + this.getEvento());
		if(this.getValor() > 0) {
			System.out.println("O valor do evento � de: " + this.getValor());
		}
		
	}
	

}
