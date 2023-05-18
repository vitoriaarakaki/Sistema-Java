package Pen;

public class Caneta {

	String modelo;
	String cor;
	Float ponta;
	Integer carga;
	Boolean tampada;

	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Ela está tampada? " + this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Caneta tampada");
		} else {
			System.out.println("Caneta destampada");
		}
	}

	void tampar() {
		this.tampada = true;

	}

	void destampar() {
		this.tampada = false;

	}
}
