
public class Carro extends Veiculo {

	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}

	private void confereCombustivel() {
		System.out.println("CONFERINDO COMBUSTÍVEL");
	}

	private void confereCambio() {
		System.out.println("CONFERINDO O CÂMBIO EM P");
	}
}
