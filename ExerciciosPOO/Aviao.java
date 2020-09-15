package ExerciciosPOO;

public class Aviao {
	String modelo;
	String fabricante;
	int anoFabricacao;
	String paisOrigem;
	double alturaAtual;
	double alturaMaxima;
	
	void decolagem() {
		System.out.println("O avi�o " + modelo + " est� decolando...");	
	}
	
	void voando(double metros) {
		double altitude = this.alturaAtual + metros;
		this.alturaAtual = altitude;
		System.out.println("Altitude atual: " + altitude + " mil p�s");
	}
	
}
